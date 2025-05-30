package MultiThreading.CreateThread.ThreadMethod;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "- Priority " + Thread.currentThread().getPriority() + "- Count: "+i);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
            MyThread t1 = new MyThread("Deep");
            MyThread t2 = new MyThread("Khokhar");
            MyThread t3 = new MyThread("Neel");
            t1.setPriority(Thread.MIN_PRIORITY);
            t2.setPriority(Thread.MAX_PRIORITY);
            t3.setPriority(Thread.NORM_PRIORITY);
            t1.start();
            t1.interrupt();
            t2.start();
            t3.start();
            t1.join(); // wait for t1 to completes
        System.out.println("Main Thread Terminates");
    }
}
