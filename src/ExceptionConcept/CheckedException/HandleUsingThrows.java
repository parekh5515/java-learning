package ExceptionConcept.CheckedException;
/*
    "throws tells that, this method might throw this type of exception(or might not),
    so caller please handle appropriately"
*/
public class HandleUsingThrows {
    public static void main(String[] args) throws ClassNotFoundException{
        method1();
    }
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
