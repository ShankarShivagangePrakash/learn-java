package collection.concurrentcollection.producerconsumerproblem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

    public static void main(String[] args) {

        // Blocking queue is an interface and Array blocking queue is its implementation.
        // while creating blocking queue you need to specify the capacity in bytes.
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(1024);

        OrderProducer orderProducer = new OrderProducer(blockingQueue);
        OrderConsumer orderConsumer = new OrderConsumer(blockingQueue);

        orderProducer.start();
        orderConsumer.start();

    }
}
