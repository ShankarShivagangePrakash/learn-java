package collection.set;

import collection.comparator.StringComparator;

import java.util.Set;
import java.util.TreeSet;

// Sort string based on their length.
public class StringTreeSetSortOnLength {

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>(new StringComparator());

        treeSet.add("mnofdfas");
        treeSet.add("abcadf");
        treeSet.add("xyz");
        treeSet.add("abc");
        treeSet.add("kioafdfafa");

        // Tree set orders string also.
        System.out.println("Tree set: " + treeSet);
    }
}
