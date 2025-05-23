package EmployeePayrollSystem;

import CarManagmentSystem.Employees;

import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    private String name;

    private int id;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    // abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee [name=" + name + ", id = " + id + ", salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmlpoyee extends Employee{
    private double monthlySalary;

    public FullTimeEmlpoyee(String name, int id, double monthlySalary){
        super(name,id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name,int id, int hoursWorked, double hourlyRate){
        super(name,id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
}

class PayrollSystem{
    private List<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee: employeeList){
            if(employee.getId() == id){
                employeeToRemove = employee;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }

    }
    public void dispplayEmployee(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmlpoyee emp1 = new FullTimeEmlpoyee("Deep Parekh",101,5000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Neel Darji",102,30,15.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Intial Employeee Details");
        payrollSystem.dispplayEmployee();

        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(102);
        System.out.println("\n Remaining Employee Details....");
        payrollSystem.dispplayEmployee();
    }

}
