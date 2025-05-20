package Enum;

public class EnumDemo {
    enum Deep{
        LOW,
        HIGH,
        MEDIUM
    }


    public static void main(String[] args) {
        Deep d1 = Deep.LOW;
        System.out.println(d1);

        //iteration over enum
        for(Deep d2 : Deep.values()){
            System.out.println(d2);
        }
    }
}
