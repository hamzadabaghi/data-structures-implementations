package basics.programming;

import basics.programming.queues.ArrayQueue;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println( queue.dequeue());
        System.out.println( queue);
    }
}
