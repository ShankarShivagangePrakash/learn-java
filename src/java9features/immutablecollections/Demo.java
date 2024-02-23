package java9features.immutablecollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        // we have created immutable list using List.of()
        List<String> stringList = List.of("abc", "xyz", "123");

        // modification of list is not allowed.
        // below line will throw error.
        // stringList.add("ght");

        // Immutable set
        // Note while creating this set you cannot give duplicate elements. it will throw error
        // similarly you cannot modify once created
        Set<String> stringSet = Set.of("abc", "xyx", "132");

        // Immutable map
        // while creating give as key1, value1, key2, value2
        Map<String, Integer> stringIntegerMap = Map.of("abc", 123, "xyz", 456);
    }
}
