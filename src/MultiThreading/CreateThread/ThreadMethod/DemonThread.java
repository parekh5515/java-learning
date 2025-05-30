package MultiThreading.CreateThread.ThreadMethod;
/*
    what is demon thread?
    ans : deamon thread is a thread which is run in background

    if we set t1.setDaemon(true)::::
    ans : suppose the t1.start() and t1 is running infinitely than we set damemon(tre) means background
    thread checks if all thread off the entire process of and bhale t1 infinite sudhi chale pan te finite]
    sudhi chaline stop thai jase

    if we donot include stopDemon(true) then process can not stop because t1 runs infinitely
 */
public class DemonThread extends Thread{
    public DemonThread(String name){
        super(name);
    }

    @Override
    public void run() {
        while (true){
            System.out.println("d1 in  processing");
        }
    }

    public static void main(String[] args) {
        System.out.println("main");
        DemonThread d1 = new DemonThread("d1"); // it is also called usrThread
        d1.setDaemon(true);
        d1.start();
        System.out.println("Terminate");
    }
}
