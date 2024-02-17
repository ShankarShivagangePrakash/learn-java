package collection.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("c++");

        Iterator<String> iterator = courses.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            // concurrent modification exception,
            // if you are accessing the list/set using iterator
            // and if you try to add/remove element then you get this exception
            courses.add("C");
        }
    }
}
