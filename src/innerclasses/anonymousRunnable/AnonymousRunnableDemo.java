package innerclasses.anonymousRunnable;

public class AnonymousRunnableDemo {

    public static void main(String[] args) {

        //No need of using implementing at class level,
        // whenever you are creating the object of thread just implement the runnable interface on fly.
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable interface implementation");
            }
        });

        thread.start();
    }
}
