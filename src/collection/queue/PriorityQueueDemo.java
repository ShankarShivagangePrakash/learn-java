package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // peek() will return the first element inserted to the queue, returns null if queue is empty.
        System.out.println("peek() on queue: " + priorityQueue.peek());

        // same as peek(), but throws exception if queue is empty.
        // System.out.println(priorityQueue.element());

        // Add elements to the queue
        for (int i = 10; i < 20; i++) {
            priorityQueue.offer(i);
        }

        System.out.println("Priority queue: " + priorityQueue);

        // removes the first element inserted to the queue.
        System.out.println("poll() on queue: " + priorityQueue.poll());

        // same as poll() but will throw exception, if queue is empty.
        System.out.println("remove() on queue: " + priorityQueue.remove());

        // Priority queue will maintain order only for the first time when queue is created
        // after insertion or deletion to it, it won't guarantee on the order.
        System.out.println("Priority queue: " + priorityQueue);
    }
}
