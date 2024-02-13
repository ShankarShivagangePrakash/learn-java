package collection.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo<S> {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("mno");

        // With list iterator we can traverse both in forward and reverse direction.
        ListIterator<String> listIterator = list.listIterator();

        // Forward direction
        System.out.println("Forward direction iteration.");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Reverse direction
        System.out.println("Reverse direction iteration.");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
