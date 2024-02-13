package collection.set;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        Random random = new Random();

        //Create list to store 10 elements
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(random.nextInt(5));
        }

        //since we are generating 10 random numbers in the range of 0 - 5, it will have duplicates
        System.out.println("List contents: " + list);

        // To remove duplicates from the array list
        // create set from list
        Set<Integer> set = new HashSet<>(list);

        // This would have removed duplicates from linked list.
        System.out.println("Set contents are: " + set);
    }
}
