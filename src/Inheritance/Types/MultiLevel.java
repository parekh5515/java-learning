package Inheritance.Types;
class A{
    void methodA(){
        System.out.println("This is the method of A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("This is the method of B");
    }
}
class C extends B{
    void methodC(){
        System.out.println("This is the method of c");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        C c1 = new C();
        c1.methodC();
        c1.methodB();
        c1.methodA();
    }
}
