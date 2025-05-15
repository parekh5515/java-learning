package Oops_Fundamentals;

public class Opps1 {
    String name;
    int rollNo;

    public void printDetails(){
        System.out.println("name is: "+name);
        System.out.println("roll is: "+rollNo);
    }
    public static void main(String[] args) {
        Opps1 o1 = new Opps1();
        o1.name = "deep";
        o1.rollNo = 14;
        o1.printDetails();

        Opps1 o2 = new Opps1();
        o2.name = "Raju";
        o2.rollNo = 15;
        o2.printDetails();



    }
}
