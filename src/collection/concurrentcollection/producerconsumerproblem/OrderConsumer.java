package collection.concurrentcollection.producerconsumerproblem;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer extends Thread {

    BlockingQueue<String> queue;

    OrderConsumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            // consumer thread will consume contents.
            // take() will retrieve head element and remove it from queue, It will wait if queue is empty
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
