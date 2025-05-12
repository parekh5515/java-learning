import java.util.*;

/*
    1.size():
        It returns total no of collection present in the list

    2. isEmpty():
        used to check collection is empty or not. it return true/false

    3. contains():
        used to search element in collection.it returns true/false

    4. toArray():
        It convert collection to an array

    5. add():
        used to insert element in the collection

    6. remove():
        used to remove element from the collection

    7.  addAll():
        used to insert one collection into another collection

    8. removeAll():
        remove all elements from collection, which are present in the collection passed in the parameter

    9. clear():
        Remove all the element from the collection

    10. equals():
        used to check two collection are equal or not

    11. stream() and parallelStream(): learn after
        provide efffective way to work with collection like filtering, processing data etc.

    12. iterator():
        we can learn in iterable collections
*/
public class CollectionMethod {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(values.equals(list));
        System.out.println(values);

        //size() --> return the size of list
        System.out.println("size: "+ values.size());

        //isEmpty() --> return true if list  is empty
        System.out.println("isEmpty: "+ values.isEmpty());

        //contains(value) --> if true if list contains value
        System.out.println("contains: "+values.contains(3));

        //add: add value to the end of the list
        values.add(5);

        //contains
        System.out.println("added 5: "+ values.contains(5));

        //remove using index
        values.remove(3);
        System.out.println("remove using index: "+values.contains(4));

        //remove using object, removes the first occurence of the value
        values.remove(Integer.valueOf(3));
        System.out.println("remove using value: "+ values.contains(3));
        System.out.println(values);

        ///  this is my collection 2


        Vector<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);

        System.out.println("my stck list is: "+ stackValues);

        //addAll : add one list inside another list
        values.addAll(stackValues);
        System.out.println("concatinated values list: "+values);

        //contains All to confirm value is added or not
        System.out.println("addAll testing using containsAll: "+ values.containsAll(stackValues));

        //remove
        values.remove(Integer.valueOf(7));
        System.out.println("removeAll after removing one element: "+ values.containsAll(stackValues));


        //removeAll
        values.removeAll(stackValues);
        System.out.println("removeAll: "+ values.contains(8));

        //clear(): clear entrire collection
        values.clear();
        System.out.println("is empty after clear values list: "+values.isEmpty());
    }
}
