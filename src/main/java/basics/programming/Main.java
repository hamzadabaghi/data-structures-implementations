package basics.programming;


import basics.programming.stacks.Stack;

public class Main {
    public static void main(String[] args) {

        Stack intStack = new Stack();
        intStack.push(9);
        intStack.push(19);
        intStack.push(29);
        intStack.push(39);
        System.out.println(intStack);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.isEmpty());
        System.out.println(intStack);

    }
}
