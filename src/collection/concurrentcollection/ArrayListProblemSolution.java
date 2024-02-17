package collection.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblemSolution {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("c++");

        Iterator<String> iterator = courses.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            // Now you don't get exception even when you add/remove to the list/set inside iterator.
            if (!courses.contains("C")) {
                courses.add("C");
            }
        }

        System.out.println("Courses list: " + courses);
    }
}
