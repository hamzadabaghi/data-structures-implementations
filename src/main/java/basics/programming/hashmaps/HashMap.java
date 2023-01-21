package basics.programming.hashmaps;

import java.util.LinkedList;

public class HashMap {
    private int capacity = 10;

    private int size;
    private final LinkedList<Entry>[] tab;

    private class Entry {

        private int key;
        private String value;

        private Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashMap() {
        this.tab = new LinkedList[this.capacity];
    }

    public HashMap(int capacity) {
        this.capacity = capacity;
        this.tab = new LinkedList[this.capacity];
    }

    public void put(int key, String value) {
        if (size == capacity) {
            throw new StackOverflowError();
        }
        int index = this.hasKey(key);
        if (tab[index] == null) {
            tab[index] = new LinkedList<>();
        }
        var bucket = tab[index];
        for (var element : bucket) {
            if (element.key == key) {
                element.value = value;
                return;
            }
        }
        tab[index].addLast(new Entry(key, value));
    }

    public String get(int key) {
        LinkedList<Entry> bucket = getBucket(key);
        if (bucket != null) {
            for (var element : bucket) {
                if (element.key == key) {
                    return element.value;
                }
            }
        }
        return null;
    }

    public void remove(int key) {
        LinkedList<Entry> bucket = getBucket(key);
        if (bucket != null) {
            bucket.removeIf(element -> element.key == key);
        }
    }

    private LinkedList<Entry> getBucket(int key) {
        int index = hasKey(key);
        var bucket = tab[index];
        return bucket;
    }

    private int hasKey(int key) {
        return Math.abs(Integer.hashCode(key)) % this.capacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (var bucket : tab) {
            if (bucket != null) {
                for (var element : bucket) {
                    sb.append(element.key).append(" : ").append(element.value).append(" , ");
                }
            }
        }
        return sb.toString();
    }
}
