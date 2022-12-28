package basics.programming;

import basics.programming.arrays.Array;

public class Main {
    public static void main(String[] args) {

        /*--------------- Arrays ---------------*/
        Array array = new Array();
        array.insert(10);
        array.insert(15);
        array.insert(20);
        array.insert(17);
        array.removeAt(1);
        System.out.println(array.indexOf(20));

    }

}
