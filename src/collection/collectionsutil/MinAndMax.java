package collection.collectionsutil;

import java.util.Arrays;
import java.util.Collections;

public class MinAndMax {

    public static void main(String[] args) {

        Integer[] arr = {10, 30, -70, 30, 570, 466};

        // Find minimum in Array using Collections
        int min = Collections.min(Arrays.asList(arr));

        // Find maximum in Array using Collections
        int max = Collections.max(Arrays.asList(arr));

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

    }
}
