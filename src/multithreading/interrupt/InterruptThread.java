package multithreading.interrupt;

public class InterruptThread extends Thread {

    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("I am child Thread");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
