package ExceptionConcept.CheckedException;

// Try/Catch/Finally or Try/Finallly

/*
    - Finally block can be use after try or after catch block
    - Finally block will always get executed either if you just return from try block from or from catch block
    - At most we can add only 1 finally block
    - Mostly used for closing object, adding logs etc
    - If jvm related issues like out of memoory, system shut down or our processes is forcefully killed. then
    finally block do not get exexuted
*/

public class TryCatchFinally {
    // try and finally
    public static void main(String[] args) throws ClassNotFoundException{
        try{
            method1("dummy");
            return;
        }finally {
            System.out.println("This is deeps finalluy block");
        }
    }

    // try catch and finally
//    public static void main(String[] args) {
//        try {
//            method1("dummy");
//        }catch (ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("This block is executed");
//        }
//    }
    public static void method1(String name) throws ClassNotFoundException{
        if(name.equals("dummy")){
            throw new ClassNotFoundException("this is class not found exception");
        }
    }
}
