package multithreading.synchronization.synchronizationblocks;

public class SharedResource {

    public void sayHello(String name, String threadName) {

        System.out.println(threadName + " entered sayHello method");
        // concurrent access is blocked by marking method as synchronized
        synchronized (this) {
            System.out.println(threadName + " acquired the lock");
            for (int i = 1; i <= 10; i++) {
                System.out.println("How are you " + name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
