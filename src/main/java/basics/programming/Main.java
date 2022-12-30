package basics.programming;

import basics.programming.arrays.Array;
import basics.programming.linkedlists.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*--------------- Arrays ---------------*/
        Array<Integer> array = new Array<Integer>();
        Integer[] intersectionArray = {10, 17, 34};
        array.insert(30);
        array.insert(10);
        array.insert(20);
        array.insert(33);
        array.insert(17);
        array.insert(1);
        array.insertAt(13, 5);
        System.out.println(array);
        array.reverse();
        System.out.println(array);
        System.out.println(array.size());
        System.out.println(array.intersect(intersectionArray, 3));
        array.removeAt(1);

        /*--------------- LinkedLists ---------------*/

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(5);
        list.addLast(7);
        list.addLast(10);
        list.addLast(12);
        System.out.println(list);
        System.out.println(list.contains(12) ? "YES" : "NO");
        System.out.println(list.indexOf(12));
        System.out.println(Arrays.toString(list.toArray()));
    }

}
