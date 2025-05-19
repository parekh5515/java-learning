package Inheritance.Types;

import java.sql.SQLOutput;

class Employee{
    void salary(){
        System.out.println("   salary = 70000    ");
    }
}
class hr extends Employee{
    void bonus(){
        System.out.println("   bonus  = 5000      ");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        hr h1 = new hr();
        h1.salary();
        System.out.println();
        h1.bonus();
    }
}
