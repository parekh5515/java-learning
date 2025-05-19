package Inheritance.Types;

interface Parent1{
    public void show();
}
interface Parent2{
    public void show();
}

class D implements Parent1,Parent2{

    @Override
    public void show() {
        System.out.println("class D is called");
    }
}

public class Multiple {
    public static void main(String[] args) {
        D d1 = new D();
        d1.show();
    }
}
