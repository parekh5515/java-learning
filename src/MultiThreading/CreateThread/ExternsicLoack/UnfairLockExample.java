package MultiThreading.CreateThread.ExternsicLoack;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    unfair lock means apde aya tan thread start karya
    aeno matlab aem nai ke tane line by line request karse
    aevo hoi sake t3 pela request kare t1 pela kare
    pan je thread pela request kare aej thread chalu thay ae jaruri nathi
    t3 ae backend ma pela request kari pan t1 pela chalu thai gyi

    or

    be thread t1 and t2 chalya j kare pan t3 ne chalva j na malyu atla mate ane unfair lock kevay
    badhane moko na male t1 and t2 continues request karya j kare
 */

public class UnfairLockExample {
    private final Lock unfiairLock = new ReentrantLock();

    public void accessResource(){
        unfiairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquires the lock");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            unfiairLock.unlock();
        }
    }
    public static void main(String[] args) {
        UnfairLockExample example = new UnfairLockExample();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread t1 = new Thread(runnable,"Thread 1");
        Thread t2 = new Thread(runnable,"Thread 2");
        Thread t3 = new Thread(runnable,"Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
