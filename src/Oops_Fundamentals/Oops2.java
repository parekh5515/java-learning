package Oops_Fundamentals;
class Dog{
    String name;

    public void eat(){
        System.out.println(name + " eats");
    }
}
public class Oops2 {
    public static void main(String[] args) {
        Dog labra = new Dog();
        labra.name = "Bruno";
        labra.eat();

        Dog vodafone = new Dog();
        vodafone.name = "Seru";
        vodafone.eat();
    }
}
