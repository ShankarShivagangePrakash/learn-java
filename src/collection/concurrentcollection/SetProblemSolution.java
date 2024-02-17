package collection.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetProblemSolution extends Thread{

    static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<>();

    @Override
    public void run() {
        courses.add("AWS");
    }

    public static void main(String[] args) throws InterruptedException {

        //spin of a new thread by creating object of the class and invoke start method which creates thread and invokes run()
        SetProblemSolution setProblemSolution = new SetProblemSolution();
        setProblemSolution.start();

        // In main thread below operation executes
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

        // waiting for 5 seconds for java to sync the copy list to original list
        Thread.sleep(5000);
        System.out.println("Courses list: " + courses);
    }
}
