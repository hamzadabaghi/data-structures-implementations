package basics.programming.hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap {
    private final int capacity;

    private int size;
    private final List<LinkedList<Entry>> tab;

    public HashMap() {
        this.capacity = 10;
        this.tab = new ArrayList<>(this.capacity);
        this.initializeTab(this.tab);
    }

    private void initializeTab(List<LinkedList<Entry>> tab) {
        for (int i = 0; i < this.capacity; i++) {
            this.tab.add(null);
        }
    }

    public HashMap(int capacity) {
        this.capacity = capacity;
        this.tab = new ArrayList<>(capacity);
        this.initializeTab(this.tab);
    }

    public void put(int key, String value) {
        if (size == capacity) {
            throw new StackOverflowError();
        }
        int index = this.hasKey(key);

        if (tab.get(index) == null) {
            var list = new LinkedList<Entry>();
            list.add(new Entry(key, value));
            tab.set(index, list);
            size++;
        } else {
            var indexElement = tab.get(index).indexOf(new Entry(key, value));
            if (indexElement == -1) {
                tab.get(index).add(new Entry(key, value));
                size++;
            } else {
                tab.get(index).set(indexElement, new Entry(key, value));
            }
        }
    }

    private int hasKey(int key) {
        return Math.abs(Integer.hashCode(key)) % this.capacity;
    }

}
