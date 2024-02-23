package java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("VIRAT");
        list.add("KOHLI");
        list.add("DHONI");

        System.out.println("Original list: " + list);

        List<String> list2 = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());

        System.out.println("Lower case list: " + list2);
    }
}
