package ExceptionConcept.CustomeException;

public class Main {
    public static void main(String[] args) {
        try{
            method1();
        }catch (MyCustomException e){
            System.out.println(e);
        }
    }
    public static void method1() throws MyCustomException{
        throw new MyCustomException("some issue arise");
    }
}
