package multithreading.synchronization;

// this is the pojo of the threads, it will try to access the resource sharedResource represents that.
// run method is for thread starting and logic to access the synchronised block in shared resource.
public class MyThread extends Thread {

    private SharedResource sharedResource;
    private String name;

    MyThread(SharedResource sharedResource, String name) {
        this.sharedResource = sharedResource;
        this.name = name;
    }

    public void run() {
        sharedResource.sayHello(name);
    }
}
