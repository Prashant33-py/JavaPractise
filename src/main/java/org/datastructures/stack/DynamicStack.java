package org.datastructures.stack;

public class DynamicStack {
    int capacity = 2;
    int[] dStack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (capacity == size()) {
            expand();
        }
        dStack[top] = data;
        top++;
    }

    private void expand() {
        int elementsAdded = 0;
        capacity++;
        int[] newDStack = new int[capacity];
        while (elementsAdded < capacity - 1) {
            newDStack[elementsAdded] = dStack[elementsAdded];
            elementsAdded++;
        }
        dStack = newDStack;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            return dStack[top];
        }
        return -1;
    }

    public int peek() {
        return dStack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(dStack[i] + " ");
        }
        System.out.println();
    }

}
