package Polymorphism;

public class MethodOverLoading {
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void sum(float a,float b,float c){
        System.out.println(a+b+c);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(int a,float b){
        return a+b;
    }

    public static String sum(String x, String y){
        return x+" "+y;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,2,2));
        sum(2.0f,2.0F,2.0F);
        System.out.println(sum(2,2));
        System.out.println(sum("deep","parekh"));
        System.out.println(sum(2,3.2f));
    }
}
