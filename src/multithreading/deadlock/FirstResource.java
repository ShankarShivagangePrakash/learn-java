package multithreading.deadlock;

public class FirstResource {

    public synchronized void method1(SecondResource secondResource) {
        System.out.println("Inside the method1 of First Resource");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("About to invoke method 2 of Second Resource");
        secondResource.method2();
    }

    public synchronized void method2() {
        System.out.println("Inside method2 of First Resource");
    }
}
