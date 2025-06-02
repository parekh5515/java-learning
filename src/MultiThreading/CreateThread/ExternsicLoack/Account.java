package MultiThreading.CreateThread.ExternsicLoack;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance = 100;

    private Lock lock = new ReentrantLock();


    public  void  withDraw(int amount){
        System.out.println(Thread.currentThread().getName() +" attempting to withdraw "+ amount);
        try{
           if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){

               if(balance >= amount){
                   try{
                       System.out.println(Thread.currentThread().getName() + " processing with withdrawal");
                        Thread.sleep(6000); // simulate time taken to process withdrawal
                        balance -= amount;
                       System.out.println(Thread.currentThread().getName()+" completed withdrawal. Rwmaining balance: "+balance);
                   }catch (Exception e){
                        Thread.currentThread().interrupt();
                   }finally {
                       lock.unlock();
                   }
               }

           }else{
               System.out.println(Thread.currentThread().getName() + " could not aquire lock, will try later");
           }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}

/*
    tryLock(1000,TimeUnit.Milliseconds)
            suppose thread1 apply the lock and thread 2 ave to tryClock ma je time line nakhi che
            tya sudhi thread2 rah jose jo tya sudhi lock khuli gyo to thik baki going to else and
            try it letter

     tryLock():
        ama try catch ma nakhvani jarur nathi jo t1 use ma che t2 avse and jose t1 ae lock lagadelu
        che to ae tarat j rah joya vina jatu rese else ma and print try it letter


      always at last ma lock.unlolck() karvanu bhulay nahi aenu dhyan rakhvu

 */
