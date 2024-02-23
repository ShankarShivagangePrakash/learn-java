package java8features.lambda;


// In this class we implement the abstract method of Runnable interface run() using lambda
// pass that runnable object to thread
// start thread execute runnable behaviour
public class RunnableWithLambda {

    public static void main(String[] args) {

        // here we are implementing the run() of Runnable interface with the behaviour we need.
        Runnable r = ()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child Thread");
            }
        };

        // Create and start thread
        Thread thread = new Thread(r);
        thread.start();

        // Execute other logic in main thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
