package Interface;
interface Car{
    public void start();
}
class ElectricCar implements Car{

    @Override
    public void start() {
        System.out.println("Electric car start");
    }
}

class DieselCar implements Car{
    @Override
    public void start(){
        System.out.println("Diesel car starts");
    }
}
public class IntefaceDemo {
    public static void main(String[] args) {
        Car tesla = new ElectricCar();
        Car xuv = new DieselCar();


        tesla.start();
        System.out.println();
        xuv.start();
    }
}
