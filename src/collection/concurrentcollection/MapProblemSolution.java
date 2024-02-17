package collection.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class MapProblemSolution extends Thread{

    static ConcurrentHashMap<String, Double> courseRatings = new ConcurrentHashMap<>();

    @Override
    public void run() {
        courseRatings.put("Docker", 4.5);
    }

    public static void main(String[] args) throws InterruptedException {

        // create new thread
        MapProblemSolution mapProblemSolution = new MapProblemSolution();
        mapProblemSolution.start();


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

        Thread.sleep(4000);
        System.out.println("courseRatings:\n" + courseRatings);
    }
}
