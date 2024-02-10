package garbagecollection;

public class GarbageCollectionDemo {


    public GarbageCollectionDemo() {
        System.out.println(this + " Garbage collection demo");
    }

    public static void main(String[] args) {

        //below we are creating objects but not assigning so they are unreachable.
        new GarbageCollectionDemo();
        new GarbageCollectionDemo();
        new GarbageCollectionDemo();
    }

    @Override
    protected void finalize() throws Throwable {
        System.gc();
    }
}
