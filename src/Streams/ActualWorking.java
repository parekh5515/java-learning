package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ActualWorking {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        Stream<Integer> numberStream = numbers.stream()
                .filter((Integer val) -> val > 3)
                .peek((Integer val) -> System.out.println("After Filter: "+val))
                .map((Integer val) -> (val * -1) )
                .peek((Integer val) -> System.out.println("after negating: "+val))
                .sorted()
                .peek((Integer val) -> System.out.println("After Sorted: "+val));

        List<Integer> filteredNumbers = numberStream.collect(Collectors.toList());

    }
}
