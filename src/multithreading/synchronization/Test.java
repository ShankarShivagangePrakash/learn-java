package multithreading.synchronization;

public class Test {


    // SharedResource can be assumed as a class having sharedResource for which concurrent access to be restricted,
    // but it is shared with thread 1 and thread 2
    // shared block lock is acquired by adding synchronized keyword against shared resource method.
    //created two threads trying to use same resource.
    //since synchronization occurs, after one thread releases lock other can execute.
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        MyThread myThread = new MyThread(sharedResource, "Steve");
        MyThread myThread1 = new MyThread(sharedResource, "John");

        myThread.start();
        myThread1.start();

    }
}
