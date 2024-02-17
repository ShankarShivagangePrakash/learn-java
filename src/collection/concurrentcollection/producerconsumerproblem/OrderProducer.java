package collection.concurrentcollection.producerconsumerproblem;

import java.util.concurrent.BlockingQueue;

public class OrderProducer extends Thread {

    BlockingQueue<String> queue;

    OrderProducer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            // producer thread will produce contents.
            // put() will push contents if there is a space in queue, else it will wait.
            queue.put("Mac Book pro");
            queue.put("Mac Book Air");
            queue.put("Mac Book M1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
