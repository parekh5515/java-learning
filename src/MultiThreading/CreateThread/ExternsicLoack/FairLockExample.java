package MultiThreading.CreateThread.ExternsicLoack;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    UnFair ma aevu hatu ke koi thread no varo na pan ave
    pan aa fair thread ma aevu hoy ke darek thread ne moko male and je thread ae pele request kari hoy
    ae pela execute thase
 */

/*
    Why we use custome lock instead of synchronized keyoword?
                    or
    Disadvantages of synchronized locking

    ans:  ===========================================  ==  = ==  = == = = = = == = == =

        1. it does not support fairness
        2. indefinite blocking
        3. does not provide interruptablity support
        4. it does not know read/write locking
 */
public class FairLockExample {
    private final Lock fairLock = new ReentrantLock(true);

    public void accessResource(){
        fairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" acquires the lock");
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" released the lock");
            fairLock.unlock();
        }
    }
    public static void main(String[] args) {
        FairLockExample example = new FairLockExample();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }

        };
        Thread t1 = new Thread(runnable,"Thread 1");
        Thread t2 = new Thread(runnable,"Thread 2");
        Thread t3  =  new Thread(runnable,"Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
