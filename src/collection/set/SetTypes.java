package collection.set;

import java.util.*;

public class SetTypes {

    public static void main(String[] args) {

        Random random = new Random();

        // hash set doesn't maintain the order.
        Set<Integer> hashSet = new HashSet<>();


        for (int i = 1; i <= 5; i++) {
            int randomNumber = random.nextInt(40);
            hashSet.add(randomNumber);
            System.out.println("random number generated: " + randomNumber);
        }

        System.out.println("Hash set contents: " + hashSet);

        // elements are order in the order of insertion.
        Set<Integer> linkedHashSet = new LinkedHashSet<>(hashSet);
        System.out.println("Linked Hash Set contents: " + linkedHashSet);

        // elements are order in ascending order.
        Set<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("Tree Hash Set contents: " + treeSet);
    }
}
