package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {
        // forEach(): perfoem action on each element of stream. Do nor return any value

        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        numbers.stream()
                .filter((Integer val) -> val > 3)
                .forEach((Integer val) -> System.out.println(val));

        // toArray() : collect the element of stream into an array
        Object[] filterNumberArrType1 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .toArray();

            //for specifivc type use below
        Integer[] filterNumberArrayType2 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .toArray((int size) -> new Integer[size]);

//        for(Integer val: filterNumberArrayType2){
//            System.out.println(val);
//        }



        //reduce():  perform assosiative aggregate function

        Optional<Integer> reducedValue = numbers.stream()
                .reduce((Integer val1, Integer val2) -> val1+val2);

        System.out.println("reduced value: "+reducedValue.get());

        //collect(collector): can used to collects the element of the stram into list

        List<Integer> no = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> filteredNumbers = no.stream()
                .filter((Integer val) -> val >= 4)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);


        //min/max(): finds the minimum or maximum element from the stream based on comparator provided
        Optional<Integer> minimumvalueType1 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .min((Integer val1,Integer val2)-> val1-val2);
        System.out.println(minimumvalueType1.get()); //op: 4

        Optional<Integer> minimumvalueType2 = numbers.stream()
                .filter((Integer val) -> val>=3)
                .min((Integer val1, Integer val2) -> val2-val1);

        System.out.println(minimumvalueType2.get()); //op:10

        Optional<Integer> maximumvalueType1 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .max((Integer val1,Integer val2)-> val1-val2);
        System.out.println(maximumvalueType1.get()); //op: 10

        Optional<Integer> maximumvalueType2 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .max((Integer val1,Integer val2)-> val2-val1);
        System.out.println(maximumvalueType2.get()); //op: 4







        // count
        long noOfValuePresent = numbers.stream().count();
        System.out.println(noOfValuePresent);

        //anyMatch(): check if any value in the stream match the given predicate and return boolean

        boolean hasValueGreaterThree = numbers.stream()
                .anyMatch((Integer val) -> val >=3);
        System.out.println(hasValueGreaterThree);

        //allMatch(): check if all value in the stream match the given predicate and return boolean
        boolean hasAllValueGreaterThree = numbers.stream()
                .allMatch((Integer val) -> val >=3);
        System.out.println(hasAllValueGreaterThree);

        //noneMatch(): chec if no value in the stream match the given predicate and return boolean
        boolean hasNoneValueGreaterThree = numbers.stream()
                .noneMatch((Integer val) -> val <=0);
        System.out.println(hasNoneValueGreaterThree);


        //findFirst(): return first element of stream
        Optional<Integer> firstValue = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .findFirst();

        System.out.println(firstValue.get());

        //findAny(): find any random element from stream
        Optional<Integer> findAny = numbers.stream()
                .findAny();
        System.out.println(findAny.get());
    }
}

/// note very important
/*
    One a terminal operation used on a stream, It is closed/consumed and can not be used again for
    another terminal operation

    List<Integer> numbers = Arrays.asList(1,2,4,7,10);

    Stream<Ineteger> filterNumbers = numbers.stream().filter((Intger val) -> val >= 3);

    //terminal
    filterNumbers.forEach((Integer val) -> sout(val))

    //trying to use closed stream again
    List<Integer> listFromStream = filterNumers.collect(Collectors.toList())

    op: give exception : stream has already been closed

 */
