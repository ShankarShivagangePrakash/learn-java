package collection.set;

import collection.comparator.StringBufferComparator;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

    public static void main(String[] args) {

        // In String buffer class, compareTo method is not overridden, so Tree Set fails to sort the elements, and we face runtime error
        // Use comparator, specify the how to sort by overriding compare() and mention that configuration should be used to create Tree Set
        // By passing that comparator in Tree Set object constructor.
        Set<StringBuffer> treeSet = new TreeSet<>(new StringBufferComparator());

        treeSet.add(new StringBuffer("mno"));
        treeSet.add(new StringBuffer("abc"));
        treeSet.add(new StringBuffer("xyz"));
        treeSet.add(new StringBuffer("kio"));

        // Tree set orders string also.
        System.out.println("Tree set: " + treeSet);
    }
}
