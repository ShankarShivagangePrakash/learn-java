package java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOtherMethods {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // fill data to arraylist
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("original list: " + list);

        // if we want to count the number of elements of a stream, we can do that using count()
        long count = list.stream().filter(i-> i %2 == 0 ).count();
        System.out.println("Number of elements in even numbers  list: " + count);

        // Print maximum and minimum in the list
        // It requires comparator let's create comparator using lambda which implements compareTo method of the functional interface.

        Comparator<Integer> comparator = (i1, i2) -> i1.compareTo(i2);
        int max = list.stream().max(comparator).get();
        System.out.println("Maximum element in the list: " + max);

        int min = list.stream().min(comparator).get();
        System.out.println("Maximum element in the list: " + min);

        // we can sort the list using streams also, sorted() returns streams you need to convert it back to list.
        // Note you can override the sorting order by passing comparator object and changing the comparator behaviour
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list: " + sortedList);
    }
}
