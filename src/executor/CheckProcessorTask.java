package executor;

public class CheckProcessorTask implements Runnable {

    String source;

    public CheckProcessorTask(String source) {
        this.source = source;
    }

    @Override
    public void run() {
        System.out.println("Check processor started processing check: " + this.source + " by thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Check processor completed processing check: " + this.source + " by thread " + Thread.currentThread().getName());
    }
}
