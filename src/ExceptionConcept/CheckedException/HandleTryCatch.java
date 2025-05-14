package ExceptionConcept.CheckedException;

import java.io.FileNotFoundException;

public class HandleTryCatch {
    public static void main(String[] args) {
        try{
            method1("dummy");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (InterruptedException | FileNotFoundException e){
            e.printStackTrace();
        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }


    }
    public static void method1(String name) throws ClassNotFoundException,InterruptedException,FileNotFoundException{
        if(name.equals("dummy")){
            throw new ClassNotFoundException("class is not exists");
        } else  {
            throw new InterruptedException("Interrupted exception");
        }
    }
}
