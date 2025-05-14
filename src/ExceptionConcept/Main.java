package ExceptionConcept;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.method1();
    }
    public void method1(){
        method2();
    }

    private void method2() {
        method3();
    }

    private void method3() {
        int b=5/0;
    }
}
