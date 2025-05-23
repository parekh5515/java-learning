package Streams;

import java.util.ArrayList;

public class WithoutStreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3000);
        list.add(4100);
        list.add(9000);
        list.add(1000);
        list.add(3500);

        int count = 0;
        for(Integer val:list){
            if(val > 3000){
                count++;
            }
        }
        System.out.println("Total employee with salary > 3000 is: "+count);
    }
}
