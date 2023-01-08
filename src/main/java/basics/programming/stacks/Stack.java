package basics.programming.stacks;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack {

    private static final int MAX_SIZE = 20;

    private int realSize;
    private int[] stackArray = new int[MAX_SIZE];

    public int push(int element) {
        if(this.realSize == MAX_SIZE) {
            throw new StackOverflowError();
        }
        return this.stackArray[realSize++] = element;
    }

    public int pop() {
        if (this.realSize == 0) {
            throw new IllegalStateException();
        }
        return this.stackArray[--realSize];
    }

    public int peek() {
        if (this.realSize != 0) {
            return this.stackArray[realSize - 1];
        }
        throw new IllegalStateException();
    }

    public boolean isEmpty() {
        return this.realSize == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(stackArray, 0, realSize);
        return Arrays.toString(content);
    }
}
