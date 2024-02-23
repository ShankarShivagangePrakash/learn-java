package java10features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        // unmodifiable list in Collectors class.

        List<Integer> list = List.of(3, 6, 15, 27, 42, 1);

        // filter out multiples of 3 and store it to a new unmodifiable list
        // similarly we can create unmodifiable set and map using collectors class.
        List<Integer> collect = list.stream().filter(i -> i % 3 == 0).collect(Collectors.toUnmodifiableList());

        // below line is not allowed, it will throw runtime exception.
        // collect.add(14);
    }
}
