package basics.programming.arrays;

public class Array {
    private int size;

    private int reelSize;
    private int[] array;

    public Array() {
        this.size = 1;
        this.array = new int[1];
    }
    public Array(int size) {
        this.size = size;
        this.array = new int[size];
    }
    public int size() {
        return this.reelSize;
    }

    public void insert(int value) {
        if (this.reelSize >= this.size) {
            this.array = this.growArray(this.array);
        }
        this.array[reelSize++] = value;
    }

    @SuppressWarnings("ManualArrayCopy")
    private int[] growArray(int[] array) {
        int[] newArray = new int[this.size * 2];
        for (int i = 0; i < this.size ; i++){
            newArray[i] = array[i];
        }
        this.size = this.size * 2;
        return newArray;
    }

    public void removeAt(int index) {

    }

    public int indexOf(int value) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder arrayInText = new StringBuilder("[ ");
        for(int i = 0 ; i < this.reelSize ; i++ ){
            arrayInText.append(this.array[i]);
            if ((i < this.reelSize - 1)) {
                arrayInText.append(" , ");
            }
        }
        return arrayInText.append(" ]").toString();
    }
}
