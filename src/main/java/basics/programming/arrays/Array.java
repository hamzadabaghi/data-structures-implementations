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

    private int reelSize;
    private T[] array;

    @SuppressWarnings("unchecked")
    public Array() {
        this.size = 10;
        this.array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public Array(int size) {
        this.size = size;
        this.array = (T[]) new Object[size];
    }

    public int size() {
        return this.reelSize;
    }

    public void insert(T value) {
        if (this.reelSize == this.size) {
            this.array = this.growArray(this.array);
        }
        this.array[reelSize++] = value;
    }

    @SuppressWarnings({"ManualArrayCopy", "unchecked"})
    private T[] growArray(T[] array) {
        T[] newArray = (T[]) new Object[this.size * 2];
        for (int i = 0; i < this.size; i++) {
            newArray[i] = array[i];
        }
        this.size = this.size * 2;
        return newArray;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= this.reelSize) {
            throw new IllegalArgumentException("The index should be greater than 0 and less then " + this.reelSize);
        }
        for (int i = index; i < this.reelSize - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.reelSize--;
    }

    public int indexOf(T value) {
        for (int i = 0; i < this.reelSize; i++) {
            if (this.array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /* support only integers */
    @SuppressWarnings("ConstantValue")
    public int max() {
        int max = (int) this.array[0];
        for (int i = 1; i < this.reelSize; i++) {
            if ((int) this.array[i] > max) {
                max = (int) this.array[i];
            }
        }
        return max;
    }

    public Array<T> intersect(T[] secondArray, int length) {
        Array<T> intersectionArray = new Array<T>(length);
        for (int i = 0; i < length; i++) {
            if (this.indexOf(secondArray[i]) != -1) {
                intersectionArray.insert(secondArray[i]);
            }
        }
        return intersectionArray;
    }

    public void reverse() {
        T temp;
        for (int i = 0; i < this.reelSize / 2; i++) {
            temp = this.array[i];
            this.array[i] = this.array[this.reelSize - i - 1];
            this.array[this.reelSize - i - 1] = temp;
        }
    }

    public void insertAt(T item, int index) {
        if (index < 0 || index >= this.reelSize) {
            throw new IllegalArgumentException("The index should be greater than 0 and less then " + this.reelSize);
        }
        if (this.reelSize >= this.size) {
            this.array = this.growArray(this.array);
        }
        for (int i = this.reelSize; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }
        this.array[index] = item;
        this.reelSize++;
    }

    @Override
    public String toString() {
        StringBuilder arrayInText = new StringBuilder("[ ");
        for (int i = 0; i < this.reelSize; i++) {
            arrayInText.append(this.array[i]);
            if ((i < this.reelSize - 1)) {
                arrayInText.append(" , ");
            }
        }
        return arrayInText.append(" ]").toString();
    }
}
