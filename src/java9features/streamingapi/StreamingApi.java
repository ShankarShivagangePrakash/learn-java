package java9features.streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingApi {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 40, 7, 18, 23, 30);

        System.out.println(" List of elements divisible by 5 in the list using filter method: "
                + list.stream().filter(x -> x % 5 == 0).collect(Collectors.toList()));

        /* takeWhile() - as long as the predicate inside takeWhile() is evaluated to true it keeps filtering.
         once it is evaluated to false, it stops not process remaining elements in the list
         for ex: 10, 40 are divisible by 5, so it keeps evaluating, but 7 is not divisible by 5
         it stops at this point
         it will not process remaining elements in the list, so that is the reason even though 30 is divisible by 5 it will not appear in result.*/
        System.out.println(" List of elements divisible by 5 in the list using takeWhile method: "
                + list.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList()));

        /* dropWhile() - negate of takeWhile()
         */
        System.out.println(" List of elements divisible by 5 in the list using takeWhile method: "
                + list.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList()));

        List<Integer> list2 = Arrays.asList(10, 40, 7, 18, 23, 30, null);

        // Stream.OfNullable(x) - excludes null value from stream.
        System.out.println(" Filter out null in the list using ofNullable method: "
                + list.stream().flatMap(x-> Stream.ofNullable(x)).collect(Collectors.toList()));

    }
}
