package MultiThreading.CreateThread;

public class Main {
    public static void main(String[] args) {

        World w1 = new World();
        w1.start();

        for (; ;){
            System.out.println("hello  "+ Thread.currentThread().getName());
        }
    }
}
