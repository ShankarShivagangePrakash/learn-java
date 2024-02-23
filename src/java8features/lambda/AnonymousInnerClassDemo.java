package java8features.lambda;

public class AnonymousInnerClassDemo {

    public static void main(String[] args) {

        // Create and pass Runnable configuration.
        // below is the normal way of doing.
        /*
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        });*/

        // let's do the same thing using lambda
        // inside thread constructor open () ->{}
        // inside {} write the logic you want
        // at the end add semi colan
        Thread thread = new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child Thread");
            }
        });
        thread.start();

        // Execute other logic in main thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
