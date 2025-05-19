package Inheritance.Types;
class Dhoni{
    public void printA() {
        System.out.println("This is dhonis helicopter shot");
    }
}
class Jadeja extends Dhoni
{
    public void printB(){
        System.out.println("this is jadeja scoop shot");
    }
}
class Axar extends Dhoni{
    public void printC(){
        System.out.println("This is the ashiwin googli");
    }
}
public class HierarchicalInherritance {
    public static void main(String[] args) {
        Dhoni d1 = new Dhoni();
        Jadeja j1  = new Jadeja();
        Axar a1 = new Axar();

        j1.printA();
        a1.printA();
    }
}
