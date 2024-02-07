package multithreading.synchronization.interthreadcommunication;


/*scenario:
    There is a child thread which calculates the total from 1 to 100
    Main thread will print the total
    we need to make sure that main thread should not print total till child thread completes execution.

To achieve this:
    We create synchronised block on the child thread, total calculation logic, because after completing the total
    it has to notify that thread execution is completed. thread.notify() works only inside the synchronised block.

    Inside the main thread, we have a synchronised block inside which we print the total by accessing childThread.total
    this synchronised block parameter is child object.
    Main thread has this object, so it will enter inside the synchronised block,
    then we are executing childThread.wait() - this means the current thread (Main thread - whichever thread is currently executing the synchronized block) will
    go to wait state by releasing the lock and continue to be in that state till it is notified

    Once child Thread notifies, it will resume the execution and prints the total*/

public class MainThread {

    public static void main(String[] args) throws InterruptedException {

        ChildThread childThread = new ChildThread();
        childThread.start();

        //To use wait() and notify() for inter thread communication they have to be inside the synchronised block
        synchronized (childThread) {
            System.out.println("Main thread is going to wait");

            /* current thread executing this synchronized block will go to wait state - that is main thread
             it will resume once the other thread having access to childThread notifies with notify() or notifyAll()
             note: Here Main thread has entered synchronized block by accessing childThread object, it's not childThread executing at this point of time at line 34*/
            childThread.wait();
            System.out.println("Main thread notified");
            System.out.println("Sum of all numbers is " + childThread.sum);
        }
    }
}
