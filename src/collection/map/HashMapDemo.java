package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        // to add an entry to map.
        hashMap.put("John", 70);
        hashMap.put("Ravi", 80);
        hashMap.put("Raju", 90);
        hashMap.put("Ram", 100);

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
