package Inheritance;
class Vehicle{
    double price;
    String color;

}
class Car extends Vehicle{
    boolean sunroof;
    String brand;

    void display(){
        System.out.println("price: "+price);
        System.out.println("color: "+color);
        System.out.println("suroof "+sunroof);
        System.out.println("brand "+brand);
    }
}
public class InheritanceDemo2 {
    public static void main(String[] args) {
        Car hondaCity = new Car();
        hondaCity.price = 1500000;
        hondaCity.color = "black";
        hondaCity.sunroof = true;
        hondaCity.brand = "honda";

        hondaCity.display();
    }
}
