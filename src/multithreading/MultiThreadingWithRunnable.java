package multithreading;

public class MultiThreadingWithRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside thread run()");
    }

    public static void main(String[] args) {
        MultiThreadingWithRunnable multiThreadingWithRunnable = new MultiThreadingWithRunnable();

        Thread thread = new Thread(multiThreadingWithRunnable);
        thread.start();
    }
}
