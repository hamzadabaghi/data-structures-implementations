package basics.programming.queues;

import java.util.Arrays;

public class ArrayQueue {

    private int size = 10;
    private int[] array;
    private int head;

    private int tail;


    public ArrayQueue() {
        array = new int[size];
    }

    public ArrayQueue(int capacity) {
        size = capacity;
        array = new int[capacity];
    }
    public void enqueue( int element ) {
        if ( isFull()) {
            throw new StackOverflowError();
        }
        array[tail++] = element;
    }

    public int dequeue() {
        if ( isEmpty() ) {
            throw new IllegalStateException();
        }
        return array[head++];
    }
    public boolean isEmpty() {
        return array.length == 0;
    }

    public boolean isFull() {
        return tail == size;
    }

    @Override
    public String toString() {
        var arrayCopy = Arrays.copyOfRange(array,head,tail);
        return Arrays.toString(arrayCopy);
    }
}
