package DataIngestionSystem;

public class DataEvent {
    private final long timestamp;
    private final String payload;

    public DataEvent(String payload) {
        this.timestamp = System.currentTimeMillis();
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    public long getTimestamp() {
        return timestamp;
    }
}

