package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"deep");
        map.put(2,"parekh");
        map.put(3,"himani");
        map.put(4,"chota bheem");

        System.out.println(map);

        String name1 = map.get(1);
        System.out.println(name1);

        String name10 = map.get(10);
        System.out.println(name10);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("deep"));

        //Iteration over map
        Set<Integer> key = map.keySet();
        for(int keys: key){
            System.out.println(map.get(keys));
        }

        //other way to iterate over map
        for(int keys: map.keySet()){
            System.out.println("key is: "+keys+" value is: "+map.get(keys));
        }

        map.remove(1);
        System.out.println(map);

        map.remove(2,"parekh");
        System.out.println(map.containsKey(2));

        map.remove(4,"deep");
        System.out.println(map.containsKey(4));

        System.out.println(map);

        map.remove(3);
        System.out.println(map);

        map.remove(4);
        System.out.println(map);
        System.out.println(map.isEmpty());

        boolean isApply = map.isEmpty();
        System.out.println(isApply);
    }
}