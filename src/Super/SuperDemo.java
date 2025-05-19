package Super;
class Animal{

    Animal(){
        System.out.println("parent class constructor...");
    }
    String color = "white";
    void eat(){
        System.out.println("animal are eatings....");
    }
}
class Dog extends Animal{
    String color = "Black";
    Dog(){
        super();
        System.out.println("super class constructor..");
//        super();// not arite hee always write first statement in constructor body

    }
    @Override
    void eat(){
        super.eat();
        System.out.println("Dogs are eating...");

    }

    void printColor(){
        System.out.println(super.color); // access parent class variavble
        System.out.println(color);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.printColor();
        d1.eat();
    }
}
