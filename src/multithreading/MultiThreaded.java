package multithreading;

public class MultiThreaded extends Thread{

    public static void main(String[] args) {

        MultiThreaded multiThreaded = new MultiThreaded();
        multiThreaded.start();

        for (int i = 1; i <= 200; i++) {
            System.out.print("i: " + i + "\t");
        }
    }

    public void run() {
        for (int j = 1; j <= 200; j++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("j: " + j + "\t");
        }
    }
}
