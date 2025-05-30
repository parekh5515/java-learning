package MultiThreading.CreateThread.Synchronization;

public class Counter {
    private int count = 0;

//    public synchronized  void increment(){
//        count++;
//    }

    // another way is synchronized block both are all most same
    public void increment(){
        synchronized (this){
            count++;
        }

    }

    public int getCounter(){
        return count;
    }
}
