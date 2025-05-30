package MultiThreading.CreateThread;

public class World extends Thread{
    @Override
    public void run() {
        for(    ; ; ){
            System.out.println("world  "+Thread.currentThread().getName());
        }
    }
}
