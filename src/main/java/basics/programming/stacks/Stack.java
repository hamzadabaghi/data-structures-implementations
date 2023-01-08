package basics.programming.stacks;

import java.util.NoSuchElementException;

public class Stack {

    private static final int MAX_SIZE = 20;

    private int realSize;
    private int[] stackArray = new int[MAX_SIZE];

    public int push(int element) {
        return this.stackArray[realSize++] = element;
    }

    public int pop() {
        int temp;
        if (this.realSize <= 0) {
            throw new NoSuchElementException();
        } else {
            temp = this.stackArray[realSize - 1];
            this.realSize--;
        }
        return temp;
    }

    public int peek() {
        if (this.realSize > 0) {
            return this.stackArray[realSize - 1];
        }
        throw new NoSuchElementException();

    }

    public boolean isEmpty() {
        return this.realSize <= 0;
    }

    @Override
    public String toString() {
        if (this.realSize < 1) {
            return "";
        }
        int i;
        StringBuffer output = new StringBuffer("[");
        for (i = 0; i < realSize - 1; i++) {
            output.append(stackArray[i]).append(",");
        }
        output.append(stackArray[i] + "]");
        return output.toString();
    }
}
