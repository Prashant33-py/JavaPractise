package org.datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack cStack = new Stack();
        cStack.push(1);
        cStack.push(2);
        cStack.pop();
        cStack.push(3);
        cStack.push(4);
        cStack.push(5);
        cStack.pop();
        System.out.println(cStack.peek());
        cStack.show();
    }
}
