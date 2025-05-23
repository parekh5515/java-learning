package DataIngestionSystem;

import java.util.concurrent.*;

public class DataPipelineApp {
    public static void main(String[] args) {
        int producerCount = 5;
        int consumerCount = 3;
        BlockingQueue<DataEvent> queue = new ArrayBlockingQueue<>(1000);

        ExecutorService producerPool = Executors.newFixedThreadPool(producerCount);
        ExecutorService consumerPool = Executors.newFixedThreadPool(consumerCount);

        for (int i = 0; i < producerCount; i++) {
            producerPool.submit(new DataProducer(queue, i));
        }

        for (int i = 0; i < consumerCount; i++) {
            consumerPool.submit(new DataConsumer(queue));
        }

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gracefully...");
            producerPool.shutdownNow();
            consumerPool.shutdownNow();
        }));
    }
}
