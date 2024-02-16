package collection.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Z");
        list.add("G");
        list.add("D");
        list.add("T");

        System.out.println("List before sorting: " + list);

        // sorts the list - modify the existing list so no need to assign back.
        Collections.sort(list);

        System.out.println("List after sorting: " + list);

        // find element in a sorted list using binary search
        int index = Collections.binarySearch(list, "G");
        System.out.println("Index is: " + index);

        // for keys not present binary search will return -negative value represents at which index this number can be inserted.
        int index2 = Collections.binarySearch(list, "Not found");
        System.out.println("index is: " + index2);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(60);
        integerList.add(40);
        integerList.add(25);
        integerList.add(18);
        integerList.add(90);

        System.out.println("Integer list before reversing: " + integerList);

        //reverse list
        Collections.reverse(integerList);
        System.out.println("Integer list after reversing: " + integerList);

    }
}
