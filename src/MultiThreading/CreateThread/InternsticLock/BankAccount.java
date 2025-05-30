package MultiThreading.CreateThread.InternsticLock;

public class BankAccount {
    private int balance = 100;

    public synchronized void withDraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " Processing with withdrawal");
            try{
                Thread.sleep(6000);
            }catch (InterruptedException e){

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrwal. ramainning balance: "+ balance);
        }else{
            System.out.println(Thread.currentThread().getName() + " insufficient balance ");
        }
    }
}
