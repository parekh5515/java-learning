package Streams;

import java.util.Arrays;
import java.util.List;

/*
    Helps to perform operation on stream concurrently, taking advantage of multi core cpu
    parallelStream() method is used instead of regular stream() method
 */
public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88,99,110);

        // sequential processing

        long sequentialProcessingStartTime = System.currentTimeMillis();
        numbers.stream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.println(val));

        System.out.println("Sequential processing time taken: "+(System.currentTimeMillis() - sequentialProcessingStartTime) + " milliseconds");


        //Parallel Processing
        long parallelProcessingStartTime = System.currentTimeMillis();
        numbers.parallelStream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.println(val));

        System.out.println("Parallel processing time taken: "+(System.currentTimeMillis() - parallelProcessingStartTime)+" millisecond");

    }
}
