package collection.arraysutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySort {

    public static void main(String[] args) {

        int[] a = {40, 20, 50, 70, 25};

        System.out.println("Before sort");
        for (int eachElement : a) {
            System.out.println(eachElement);
        }

        // Sort array using Arrays util
        Arrays.sort(a);

        System.out.println("After sort");
        for (int eachElement : a) {
            System.out.println(eachElement);
        }

        // Arrays to list
        List<int[]> ints = Arrays.asList(a);
        // note: when you use asList(), it is just a wrapper to primitive array
        // you cannot change the size of the arrayList, you cannot add, delete elements to arrayList
        // if you make any changes to array it will reflect in arrayList and vice versa holds good.


    }
}
