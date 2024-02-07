package multithreading.daemonthread;

public class DaemonThreadTest {

    public static void main(String[] args) {

        System.out.println("Check is main thread daemon or not? " + Thread.currentThread().isDaemon());

        DaemonThread daemonThread = new DaemonThread();

        //set the thread as daemon, it has to be done before starting the thread.
        daemonThread.setDaemon(true);
        System.out.println("is new thread daemon? " + daemonThread.isDaemon());
        //start the thread
        daemonThread.start();

        System.out.println("Main thread completed execution, exiting program");
    }
}
