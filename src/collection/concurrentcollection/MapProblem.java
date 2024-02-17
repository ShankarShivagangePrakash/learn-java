package collection.concurrentcollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MapProblem {

    public static void main(String[] args) {

        HashMap<String, Double> courseRatings = new HashMap();

        courseRatings.put("Java", 5.0);
        courseRatings.put("Python", 5.0);
        courseRatings.put("c++", 5.0);

        // way to get iterator for maps.
        Iterator<String> iterator = courseRatings.keySet().iterator();

        while (iterator.hasNext()) {

            System.out.println("course name: " + iterator.next() + " \trating: " + courseRatings.get(iterator.next()));

            // concurrent modification exception,
            // if you are accessing the list/set using iterator
            // and if you try to add/remove element then you get this exception
            courseRatings.put("C", 4.0);
        }
    }
}
