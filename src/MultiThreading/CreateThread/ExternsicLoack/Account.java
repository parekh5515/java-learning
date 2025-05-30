package MultiThreading.CreateThread.ExternsicLoack;

public class Account {
    private int balance = 100;

    public void getBalance(int amount){
        System.out.println(Thread.currentThread().getName() +" attempting to withdraw "+ amount);

        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " processing with withdrawal");

            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "  completed withdrawal. remaining balance: "+balance);

        }else{
            System.out.println(Thread.currentThread().getName()+ " insufficient balance ");
        }
    }
}
