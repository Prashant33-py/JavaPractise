package org.datastructures.stack;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public int pop() {
        top--;
        return stack[top];
    }

    public int peek() {
        return stack[top-1];
    }

    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}