package multithreading.deadlock;

public class SecondResource {

    public synchronized void method1(FirstResource firstResource) {
        System.out.println("Inside the method1 of Second Resource");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("About to invoke method 2 of First Resource");
        firstResource.method2();

    }

    public synchronized void method2() {
        System.out.println("Inside method2 of Second Resource");
    }
}
