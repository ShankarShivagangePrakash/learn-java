package garbagecollection;

public class GarbageCollectionDemo {

    int objectId;

    public GarbageCollectionDemo(int objectId) {
        this.objectId = objectId;
        System.out.println("Created " + this.objectId);
    }

    public static void main(String[] args) {

        //below we are creating objects but not assigning so they are unreachable.
        //force JVM to initiate garbage collection by creating a lot of unreachable objects.
        for (int i = 0; i <= 500000; i++) {
            new GarbageCollectionDemo(i);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Invoked finalized method for " + this.objectId);
        System.gc();
    }
}
