package multithreading.interrupt;

public class Test {

    public static void main(String[] args){
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        interruptThread.interrupt();
    }
}
