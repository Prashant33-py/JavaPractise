package org.datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack cStack = new Stack();
        System.out.println("Is stack empty? - "+(cStack.isEmpty() ? "Yes" : "No"));
        cStack.push(1);
        cStack.push(2);
        cStack.pop();
        cStack.push(3);
        cStack.push(4);
        cStack.push(5);
        cStack.pop();
        System.out.println(cStack.peek());
        System.out.println("Is stack empty? - "+(cStack.isEmpty() ? "Yes" : "No"));
        System.out.println("Size of stack: "+cStack.size());
        cStack.show();
    }
}
