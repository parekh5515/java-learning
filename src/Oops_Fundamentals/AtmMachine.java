package Oops_Fundamentals;

import java.util.Scanner;

class Atm{
    int pin = 5678;
    float balance;
    Scanner sc = new Scanner(System.in);
    public void checkPin(){

        System.out.println("Enter Your pin: ");
        int clientPin = sc.nextInt();

        if(clientPin == pin){
            menu();
        }else{
            System.out.println("please enter valid pin!!!");
            checkPin();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                viewBalance();
                break;
            case 2:
                withDraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                return;
            default:
                System.out.println("please enter a valid choice for further processing!!!");
        }
    }
    public void viewBalance(){
        System.out.println("Balance is: "+balance);
        menu();
    }
    public void withDraw(){
        System.out.println("Enter amount to withdraw: ");
        float amount = sc.nextFloat();
        if(amount >= 20000){
            int otp = 6789;
            System.out.println("enter otp please: ");
            int enterOtp = sc.nextInt();
            if(enterOtp != otp){
                System.out.println("enter otp is invalid!! unauthorized");
//                return;
                menu();
            }
        }




        if(amount > balance){
            System.out.println("Tera bap yaha chod ke gaya ya teri ma, Babu rav ganpat rav apte");
        }else{
            balance = balance - amount;
            System.out.println("Money Withdraw Successfully!!!!!");
        }
        menu();
    }
    public void deposit(){
        System.out.println("Enter amount to be deposit: ");
        float depositeAmount = sc.nextFloat();
        if(depositeAmount > 10000){
            System.out.println("enter no between 20-90");
            int random = sc.nextInt();

        }
        if(depositeAmount < 500){
            System.out.println("deposit amount at least 500");
        }else{
            balance = balance + depositeAmount;
            System.out.println("money deposit successfully!!! Apki aur bachat rahe dhnyavad");
        }
        menu();
    }

}
public class AtmMachine {
    public static void main(String[] args) {
        Atm a1 = new Atm();
        a1.checkPin();
    }
}
