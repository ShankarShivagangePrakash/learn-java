package multithreading;

public class ThreadPriority extends Thread {

    public static void main(String[] args) {

        //Thread 1
        ThreadPriority threadPriority1 = new ThreadPriority();
        threadPriority1.setName("thread 1");
        threadPriority1.setPriority(MAX_PRIORITY);
        threadPriority1.start();

        //Thread 2
        ThreadPriority threadPriority2 = new ThreadPriority();
        threadPriority2.setName("thread 2");
        threadPriority2.setPriority(MIN_PRIORITY);
        threadPriority2.start();

    }

    public void run() {
        System.out.println("Thread name is " + ThreadPriority.currentThread().getName());
    }
}
