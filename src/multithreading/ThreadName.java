package multithreading;

public class ThreadName extends Thread {

    public static void main(String[] args) {

        //starts a new thread by invoking start() which internally invokes run()
        ThreadName threadName = new ThreadName();
        threadName.start();

        Thread currentThread = Thread.currentThread();
        System.out.println("This is the main() thread and its name is "+ currentThread.getName());
    }

    public void run() {
        System.out.println("Inside the other thread and its name is " + ThreadName.currentThread().getName());
        System.out.println("Let's assign a new name to this thread");
        Thread currentThread = ThreadName.currentThread();
        currentThread.setName("Other Thread");
        System.out.println("New name of this thread is " + currentThread.getName());
    }
}
