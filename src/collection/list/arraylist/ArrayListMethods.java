package collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {

        // List is the parent interface for array list,
        // It is good practice to specify the parent interface type at left, so it is easier to switch to other list types in the future.
        List<Integer> list = new ArrayList<>();

        //Add elements to array list in a loop
        for (int i = 0; i <= 100; i = i + 10) {
            list.add(i);
        }

        // To display array list contents you can just specify list name in System.out.print()
        System.out.println("List: " + list);

        // To insert an element at a specified position in array list
        // first parameter - index, second parameter - value
        list.add(2, 100);
        System.out.println("List after insertion: " + list);

        // To replace a particular index to with a new value
        list.set(4, 300);
        System.out.println("List after replacement: " + list);

        // To find out number of elements in array list.
        System.out.println("List size: " + list.size());

        // Add list to another list
        List<Integer> secondList = new ArrayList<>();

        // append element to end of the list
        secondList.add(111);
        secondList.add(222);
        secondList.add(333);

        // Add list to another list
        list.addAll(secondList);
        System.out.println("List after other list addition: " + list);

        //search for an element in a list.
        System.out.println("List contains 111 ? " + list.contains(111));

        // remove an element in array list based on index
        // element at index 4 will be removed
        list.remove(4);

        System.out.println("List after deletion: " + list);

    }
}
