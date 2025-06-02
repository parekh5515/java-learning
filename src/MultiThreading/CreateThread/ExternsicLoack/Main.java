package MultiThreading.CreateThread.ExternsicLoack;

public class Main {
    public static void main(String[] args) {
        Account sbi = new Account();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                sbi.withDraw(50);
            }
        };
        Thread t1 = new Thread(runnable,"Thread1");
        Thread t2 = new Thread(runnable,"Thread2");

        t1.start();
        t2.start();
    }
}
