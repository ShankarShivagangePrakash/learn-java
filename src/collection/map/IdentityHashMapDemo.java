package collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // Two integer objects having same value, they both will be in different locations of memory.
        Integer id1 = new Integer(10);
        Integer id2 = new Integer(10);

        // even-though you are adding value for different integer objects.
        // Hash Map will check for the value as key not location. so it will update the previous entry, 10 -Ram will be updated to 10-Govind
        map.put(id1, "Ram");
        map.put(id2, "Govind");

        System.out.println("Hash map contents: " + map);

        // Identity hash map will check for == operator that is memory location for keys. So it will have two entries in its map
        Map<Integer, String> identityHashMap = new IdentityHashMap<>();

        identityHashMap.put(id1, "Ram");
        identityHashMap.put(id2, "Govind");

        System.out.println("Hash map contents: " + identityHashMap);

    }
}
