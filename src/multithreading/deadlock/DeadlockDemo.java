package multithreading.deadlock;

/* 	Let's consider a scenario
    There are two classes A and B each having two synchronized methods
    Inside Class A, first synchronized method is trying to invoke Class B second synchronized method
    Similarly, Inside Class B, first synchronized method is trying to invoke Class A second synchronized method
    During runtime, Thread 1 accessing Class A method 1. will acquire lock on all synchronized methods of Class A
    Similarly Thread 2 accessing Class B method 1, will acquire lock on all synchronized method of class B

    But each of thread to complete execution they need to access other class synchronized method also
    They keep waiting infinitely and result in deadlock. */

public class DeadlockDemo implements Runnable {

    //Creating first and second resources.
    private FirstResource firstResource = new FirstResource();
    private SecondResource secondResource = new SecondResource();

    public DeadlockDemo() {

        //starting new thread to invoke first resource method 1()
        new Thread(this).start();

        //main thread will be available by default, inside main thread invoke second resource method1().
        ///This will result in deadlock
        secondResource.method1(firstResource);
    }

    public static void main(String[] args) {
        new DeadlockDemo();
    }


    // run method invoked automatically when thread started,
    // so it means we are invoking first resource method 1() from thread 1
    @Override
    public void run() {
        firstResource.method1(secondResource);
    }
}
