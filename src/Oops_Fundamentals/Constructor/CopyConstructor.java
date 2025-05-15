package Oops_Fundamentals.Constructor;
class Student{
    String name;
    int rollNo;

    //Parameterized constructor
    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    //Copy constructor
    Student(Student s){
        this.name = s.name;
        this.rollNo = s.rollNo;
    }

    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll No: "+ rollNo);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Deep",14);
        Student s2= new Student(s1);

        System.out.println("Orignal Student: ");
        s1.display();

        System.out.println("copied student");
        s2.display();
    }
}
