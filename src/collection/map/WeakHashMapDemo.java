package collection.map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {

        // Weak hashmap, if the key is pointing to null memory location.
        // And if garbage collection initiates it will return that entry from the weak hash map.
        Map<User, String> weakHashMap = new WeakHashMap<>();

        User user = new User();
        weakHashMap.put(user, "John");

        System.out.println("Weak HashMap before making user object null: " + weakHashMap);

        // user assigned to null.
        user = null;

        System.gc();
        Thread.sleep(5000);

        // Now, weak hash map contents will be empty as garbage collection has emptied
        System.out.println("Weak Hash map after: " + weakHashMap);
    }
}
