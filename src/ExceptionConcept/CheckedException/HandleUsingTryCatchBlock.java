package ExceptionConcept.CheckedException;

import static ExceptionConcept.CheckedException.HandleUsingThrows.method1;

/*
    Handling Exceptions Using try-catch in Java
===========================================

Syntax:
-------
try {
    // Code that may throw an exception
} catch (ExceptionType name) {
    // Code to handle the exception
}
*/
public class HandleUsingTryCatchBlock {


        // One Way

//    public static void main(String[] args) {
//        try {
//            method1();
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//
//    }
//    public static void method1() throws ClassNotFoundException{
//        throw new ClassNotFoundException();
//    }

        // Second Way
        public static void main(String[] args) {
            method1();
        }
        public static void method1(){
            try{
                System.out.println("hello");
                throw new ClassNotFoundException("this is class not exisis");
            }catch (ClassNotFoundException e){
//                System.out.println(e);
//                e.printStackTrace();
//                System.out.println(e.getMessage());
            }
        }
}
