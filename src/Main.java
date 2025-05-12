//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);
        int guessNumber = 0;
        do{
            System.out.println("Guess the number(1-100): ");
            guessNumber = sc.nextInt();

            if(guessNumber == myNumber){
                System.out.println("yehhh.... You won the match ...ae he");
                break;
            }else if(guessNumber > myNumber){
                System.out.println("the number is too large");
            }else{
                System.out.println("the number is too small");
            }
        }while(guessNumber >= 0);

        System.out.println("End of the game");
        System.out.println("the correct number is: "+myNumber);

    }
}