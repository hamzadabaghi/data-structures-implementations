package basics.programming;

import basics.programming.linkedlists.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(5);
        list.addLast(7);
        list.addLast(10);
        list.addLast(12);
        System.out.println(list);
        list.reverse(); // expected : [12, 10, 7, 5]
        System.out.println(list);
    }
}
