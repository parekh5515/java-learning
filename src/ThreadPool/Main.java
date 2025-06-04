package ThreadPool;
/*
    Before Thread Pool example

    thread pool ontroduce natu thayau ae pela aa apde manuallly thread create  karta ta and kam
    karta ta jem ke niche mujab

    thread to count factorial of given no

*/
public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("start Time: "+startTime);
        Thread[] threads = new Thread[9];

        for(int i=1; i<10; i++){
            int finalI = i;
            threads[i-1] = new Thread(
                    () -> {
                        long result = factorial(finalI);
                        System.out.println(result);
                    }
            );
            threads[i-1].start();
        }
        for(Thread thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total Time: "+(System.currentTimeMillis() - startTime));
    }

    private static int factorial(int n) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        int result  = 1;
        for(int i=1; i<=n; i++){
            result = result*i;
        }
        return result;
    }
}
