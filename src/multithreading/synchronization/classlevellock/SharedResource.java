package multithreading.synchronization.classlevellock;

public class SharedResource {

    // concurrent access is blocked by marking method as synchronized
    public synchronized static void sayHello(String name) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("How are you " + name);
        }
    }
}
