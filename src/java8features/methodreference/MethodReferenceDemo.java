package java8features.methodreference;

public class MethodReferenceDemo{

    // we are going to map this method to Runnable interface run(), signature should match for both in order to map.
    public void myMethod() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {

        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        // map myMethod to runnable interface, whenever any method inside Runnable interface whose signature matches myMethod is invoked
        // myMethod gets executed.
        Runnable runnable = methodReferenceDemo::myMethod;

        // create and start thread using runnable interface
        Thread thread = new Thread(runnable);
        thread.start();

        //main thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }

    }
}
