package collection.concurrentcollection;

import java.util.HashSet;
import java.util.Iterator;

public class SetProblem {

    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<>();

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
