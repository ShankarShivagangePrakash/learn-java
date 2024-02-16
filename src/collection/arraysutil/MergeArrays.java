package collection.arraysutil;

import packages.p2.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {

    public static void main(String[] args) {

        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"D", "E", "F"};

        // added both the arrays to list
        ArrayList<String> list = new ArrayList<>(Arrays.asList(a1));
        list.addAll(Arrays.asList(a2));

        // get array from list
        Object[] mergedArray = list.toArray();

        // display array using Arrays.toString()
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

    }
}
