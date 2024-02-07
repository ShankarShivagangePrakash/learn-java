package multithreading.synchronization.classlevellock;

// this is the pojo of the threads, it will try to access the resource sharedResource represents that.
// run method is for thread starting and logic to access the synchronised block in shared resource.
public class MyThread extends Thread {

    private String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        SharedResource.sayHello(name);
    }
}
