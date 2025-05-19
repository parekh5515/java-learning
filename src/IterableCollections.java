import java.util.List;
import java.util.*;
public class IterableCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            int val = it.next();
            System.out.println(val);
            if (val == 3) {
                it.remove();
            }
        }
        System.out.println("Iterating values using for each loop: ");
        for(int val: list) {
            System.out.println(val);
        }
        System.out.println("using for each method: ");
        list.forEach((val) -> System.out.println(val));
    }
}
