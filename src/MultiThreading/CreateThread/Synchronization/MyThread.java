package MultiThreading.CreateThread.Synchronization;

public class MyThread extends Thread{
    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            counter.increment();
        }
    }
}
