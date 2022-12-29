package basics.programming;

import basics.programming.linkedlists.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(5);
        list.addFirst(7);
        System.out.println(list);
    }
}
