package DataIngestionSystem;

import java.util.concurrent.BlockingQueue;

public class DataProducer implements Runnable {
    private final BlockingQueue<DataEvent> queue;
    private final int id;

    public DataProducer(BlockingQueue<DataEvent> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String payload = "Producer-" + id + " : " + Math.random();
                queue.put(new DataEvent(payload)); // Blocks if full
                Thread.sleep(10); // Simulate rapid data generation
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
