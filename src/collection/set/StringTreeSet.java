package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("mno");
        treeSet.add("abc");
        treeSet.add("xyz");
        treeSet.add("kio");

        // Tree set orders string also.
        System.out.println("Tree set: " + treeSet);
    }
}
