package collection.map;

import java.util.*;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        //order will be same the insertion order.
        Map<String, Integer> hashMap = new LinkedHashMap<>();

        // to add an entry to map.
        hashMap.put("Raju", 90);
        hashMap.put("John", 70);
        hashMap.put("Ram", 100);
        hashMap.put("Ravi", 80);

        // To get all keys of a map, since keys cannot be duplicate using set
        Set<String> keys = hashMap.keySet();
        System.out.println("Keys: " + keys);

        // To get values
        Collection<Integer> values = hashMap.values();
        System.out.println("Values: " + values);

        for (String key : keys) {
            System.out.printf("Key: %s \tvalue: %s\n", key, hashMap.get(key));
        }

    }
}
