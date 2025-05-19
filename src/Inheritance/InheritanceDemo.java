package Inheritance;
class Parent{
    void display(){
        System.out.println("this is a parent");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("this is a child");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
        System.out.println();
        c1.show();
    }
}
