package basics.programming;

import basics.programming.arrays.Array;

public class Main {
    public static void main(String[] args) {

        /*--------------- Arrays ---------------*/
        Array<Double> array = new Array<Double>();
        array.insert(10.0);
        array.insert(15.0);
        array.insert(20.0);
        array.insert(17.0);
        array.removeAt(1);
        System.out.println(array);
        System.out.println(array.size());

    }

}
