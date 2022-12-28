package basics.programming;

import basics.programming.arrays.Array;

public class Main {
    public static void main(String[] args) {

        /*--------------- Arrays ---------------*/
        Array<Integer> array = new Array<Integer>();
        Integer[] intersectionArray = {10,17,34};
        array.insert(10);
        array.insert(30);
        array.insert(20);
        array.insert(17);
        array.removeAt(1);
        System.out.println(array.max());
        System.out.println(array.size());
        System.out.println(array.intersect(intersectionArray,3));

    }

}
