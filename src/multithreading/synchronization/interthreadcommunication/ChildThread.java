package multithreading.synchronization.interthreadcommunication;

public class ChildThread extends Thread {

    int sum;

    @Override
    public void run() {

        System.out.println("Child Thread is calculating the sum");

        //To use wait() and notify() for inter thread communication they have to be inside the synchronised block
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            this.notify();
        }

    }
}
