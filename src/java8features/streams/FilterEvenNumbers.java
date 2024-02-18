package java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // fill data to arraylist
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("original list: " + list);

        /* With streams, we can process data in declarative manner like SQL
         list.stream() first step
         configuration - filter() it filters the streams data based on the predicate
                         In this case predicate is i%2 == 0 ,it checks for this condition and returns true or false for every element
         processing - result of the configuration step is stored into a new list
                     - collect() is used. */
        List<Integer> filteredList = list.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList());

        System.out.println("Filtered event numbers list: " + filteredList);

    }

}
