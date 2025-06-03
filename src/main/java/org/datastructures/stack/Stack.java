package org.datastructures.stack;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if (top > 4){
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            return stack[top];
        }
        return -1;
    }

    public int peek() {
        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top <= 0;
    }

    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}