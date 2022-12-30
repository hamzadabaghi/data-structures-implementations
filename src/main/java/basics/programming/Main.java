package basics.programming;

import basics.programming.linkedlists.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(5);
        list.addLast(7);
        list.addLast(10);
        list.addLast(12);
        list.removeLast();
        list.removeLast();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.contains(12) ? "YES" : "NO");
        System.out.println(list.indexOf(12));
        System.out.println(list.size());
    }
}
