package basics.programming.arrays;

/**
 * Custom Array Class.
 *
 * @author hamzadabaghi.
 * Default size : 10.
 * Growth factor  : x 2.
 */
public class Array<T> {
    private int size;
    private int realSize;
    private T[] array;

    @SuppressWarnings("unchecked")
    /**
     * complexity : O(1).
     */
    public Array() {
        this.size = 10;
        this.array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    /**
     * complexity : O(1).
     */
    public Array(int size) {
        this.size = size;
        this.array = (T[]) new Object[size];
    }

    /**
     * complexity : O(1).
     */
    public int size() {
        return this.realSize;
    }

    /**
     * complexity : O(n).
     */
    public void insert(T value) {
        if (this.realSize == this.size) {
            this.array = this.growArray(this.array);
        }
        this.array[realSize++] = value;
    }

    @SuppressWarnings({"ManualArrayCopy", "unchecked"})
    /**
     * complexity : O(n).
     * @param array
     */
    private T[] growArray(T[] array) {
        T[] newArray = (T[]) new Object[(int) (this.size * 0.25)];
        for (int i = 0; i < this.size; i++) {
            newArray[i] = array[i];
        }
        this.size = this.size * 2;
        return newArray;
    }

    /**
     * complexity : O(n).
     * @param index
     */
    public void removeAt(int index) {
        if (index < 0 || index >= this.realSize) {
            throw new IllegalArgumentException("The index should be greater than 0 and less then " + this.realSize);
        }
        for (int i = index; i < this.realSize - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.realSize--;
    }

    /**
     * complexity : O(n)
     * @param value
     * @return
     */
    public int indexOf(T value) {
        for (int i = 0; i < this.realSize; i++) {
            if (this.array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /* support only integers */

    /**
     * Complexity : O(n).
     * @return
     */
    @SuppressWarnings("ConstantValue")
    public int max() {
        int max = (int) this.array[0];
        for (int i = 1; i < this.realSize; i++) {
            if ((int) this.array[i] > max) {
                max = (int) this.array[i];
            }
        }
        return max;
    }

    /**
     * Complexity : O(n^2).
     * @param secondArray
     * @param length
     * @return
     */
    public Array<T> intersect(T[] secondArray, int length) {
        Array<T> intersectionArray = new Array<T>(length);
        for (int i = 0; i < length; i++) {
            if (this.indexOf(secondArray[i]) != -1) {
                intersectionArray.insert(secondArray[i]);
            }
        }
        return intersectionArray;
    }

    /**
     * complexity : O(n / 2).
     */
    public void reverse() {
        T temp;
        for (int i = 0; i < this.realSize / 2; i++) {
            temp = this.array[i];
            this.array[i] = this.array[this.realSize - i - 1];
            this.array[this.realSize - i - 1] = temp;
        }
    }

    /**
     * Complexity O(n).
     * @param item
     * @param index
     */
    public void insertAt(T item, int index) {
        if (index < 0 || index >= this.realSize) {
            throw new IllegalArgumentException("The index should be greater than 0 and less then " + this.realSize);
        }
        if (this.realSize >= this.size) {
            this.array = this.growArray(this.array);
        }
        for (int i = this.realSize; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }
        this.array[index] = item;
        this.realSize++;
    }

    @Override
    /**
     * complexity : O(n).
     * @return String
     */
    public String toString() {
        StringBuilder arrayInText = new StringBuilder("[ ");
        for (int i = 0; i < this.realSize; i++) {
            arrayInText.append(this.array[i]);
            if ((i < this.realSize - 1)) {
                arrayInText.append(" , ");
            }
        }
        return arrayInText.append(" ]").toString();
    }
}
