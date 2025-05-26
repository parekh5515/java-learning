package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,3,4,6);

        Stream<Integer> numberStream = numbers.stream()
                .filter((Integer val) -> val > 2 )
                .peek((Integer val) -> System.out.println(val));

        List<Integer> numberList = numberStream.collect(Collectors.toList());
        System.out.println(numberList);

        //limit(long maxSize)
        Stream<Integer> noList = numbers.stream().limit(3);
        List<Integer> li = noList.collect(Collectors.toList());
        System.out.println(li);

        // skip(item )
        Stream<Integer> remainingStream = numbers.stream().skip(3);
        List<Integer> remainingList = remainingStream.collect(Collectors.toList());
        System.out.println(remainingList);
    }
}
