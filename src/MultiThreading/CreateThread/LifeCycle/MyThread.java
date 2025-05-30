package MultiThreading.CreateThread.LifeCycle;

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Running");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); /// NEW

        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        t1.join(); // block main thread until thrad
        System.out.println(t1.getState());
//        System.out.println(Thread.currentThread().getState());
    }
}
