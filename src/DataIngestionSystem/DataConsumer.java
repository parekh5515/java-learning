package DataIngestionSystem;

import java.util.concurrent.BlockingQueue;

public class DataConsumer implements Runnable {
    private final BlockingQueue<DataEvent> queue;

    public DataConsumer(BlockingQueue<DataEvent> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                DataEvent event = queue.take(); // Blocks if empty
                persist(event);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void persist(DataEvent event) {
        try {
            // Simulated storage (could be DB/file)
            System.out.println("Persisted: " + event.getPayload());
        } catch (Exception e) {
            System.err.println("Failed to persist: " + event.getPayload());
        }
    }
}
