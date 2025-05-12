import java.util.*;
import java.util.Collections;

/*
                            Collection V/s Collections
        Collection: Collection is a part of Java Collection Framework. And its an interface, which expose various methods
        implemented by various collection classes like ArrayList, Stack, LinkedList etc.



        Collections: is a utility class and provide static methods, which are used to operate o collections like
        swapping, searching, reverse, copy etc

        Method provide by Collections is:
        sort()
        binarySearch()
        get()
        reverse()
        shuffle()
        swap()
        copy()
        min()
        max()
        rotate()
        unmodifiableCollection()

*/
public class CollectionVsCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println("max value: "+ Collections.max(list));
        System.out.println("min value: "+ Collections.min(list));
        System.out.println("list before sorting: "+list);
        Collections.sort(list);
        System.out.println("list after sorting: "+list);
        //foreach
        list.forEach((Integer val) -> System.out.println(val));
    }
}
