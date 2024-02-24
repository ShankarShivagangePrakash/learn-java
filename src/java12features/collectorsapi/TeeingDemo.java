package java12features.collectorsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingDemo {

    public static void main(String[] args) {

        // Consider this list.
        List<Integer> list = Arrays.asList(5, 10, 8, 20, 7, 15);

        // We need to filter the elements greater than 10, and also we need to find the count of elements greater than 10 and their sum

        var result = list.stream()
                .collect(Collectors.teeing(
                        // First downstream: filter numbers greater than 10 and count them
                        Collectors.filtering(n -> n > 10, Collectors.counting()),
                        // Second downstream: calculate the sum of numbers greater than 10
                        Collectors.filtering(n -> n > 10, Collectors.summingInt(Integer::intValue)),
                        // Merger: combine the two downstream results into a Result object
                        Result::new
                ));

        System.out.println(result);

    }
}
