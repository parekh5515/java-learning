package MultiThreading.CreateThread.ThreadMethod;

public class ThreadYeild extends Thread{
    public ThreadYeild(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadYeild t1 = new ThreadYeild("t1");
        ThreadYeild t2 = new ThreadYeild("t2");

        t1.start();
        t2.start();
    }
}
