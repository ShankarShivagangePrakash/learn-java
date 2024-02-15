package collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableTreeSetDemo {

    public static void main(String[] args) {

        NavigableSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(50);

        // By default, in tree set elements will be sorted in ascending order.
        System.out.println("Tree set: " + treeSet);

        //returns the lowest element which is greater than or equal to the element we are passing in parameter
        System.out.println("ceil(): " + treeSet.ceiling(20));

        // returns the lowest element which is greater than to the element we are passing in
        System.out.println("higher(): " + treeSet.higher(40));

        // returns the highest element in the set but which is less than or equal to element passed in parameter.
        System.out.println("floor(): " + treeSet.floor(10));

        // returns the highest element in the set but which is less than or equal to element passed in parameter.
        System.out.println("lower(): " + treeSet.lower(30));

        // removes the first element in the set and returns it.
        System.out.println("pollFirst(): " + treeSet.pollFirst());

        // removes the first element in the set and returns it.
        System.out.println("pollLast(): " + treeSet.pollLast());

        // removes the first element in the set and returns it.
        System.out.println("descendingSet(): " + treeSet.descendingSet());

        treeSet = treeSet.descendingSet();
        System.out.println("Tree set in descending order: " + treeSet);

    }
}
