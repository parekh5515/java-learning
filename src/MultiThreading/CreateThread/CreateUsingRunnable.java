package MultiThreading.CreateThread;

class Worlds implements Runnable{
    @Override
    public void run() {
        for( ; ; ){
            System.out.println("World  "+Thread.currentThread().getName());
        }
    }
}
public class CreateUsingRunnable {
    public static void main(String[] args) {

        Worlds w1 = new Worlds();
        Thread t1 = new Thread(w1);
        t1.start();

        for( ; ; ){
            System.out.println("Hello  "+Thread.currentThread().getName());
        }
    }
}
