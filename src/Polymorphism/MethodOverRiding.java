package Polymorphism;

class Bank{
    public void roi(){
        System.out.println("the general roi is 6.1%");
    }
}

class SBI extends Bank{
    @Override
    public void roi(){
        System.out.println("the sbi roi is 6.9");
    }
}
class PNB extends Bank{
    @Override
    public void roi(){
        System.out.println("the pnb roi is 7.1%");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        Bank b1  = new Bank();
        SBI s1 = new SBI();
        PNB p1 = new PNB();

        b1.roi();
        s1.roi();
        p1.roi();

    }
}
