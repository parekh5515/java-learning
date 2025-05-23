package Streams;

import java.util.ArrayList;

public class WithStreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3000);
        list.add(4100);
        list.add(9000);
        list.add(1000);
        list.add(35000);

        long output = list.stream().filter((Integer sal) -> sal > 3000).count();
        System.out.println("Employee with salary > 3000 is: "+output);

    }
}
