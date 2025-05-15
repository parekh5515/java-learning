package Oops_Fundamentals.Constructor;

class Students{
    int id;
    String name;
    {
        System.out.println("hello from block");
    }
    Students(){
        System.out.println("hello from no parameterized constructor");
    }
    Students(int id,String name){
        this.id = id;
        this.name = name;
    }
    Students (float id, int no){
        System.out.println(id);
        System.out.println(no);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Students s1 = new Students(1,"deep");
        Students s2 = new Students();
        Students s3 = new Students();
        System.out.println(s1.name);
        System.out.println(s1.id);
    }
}
