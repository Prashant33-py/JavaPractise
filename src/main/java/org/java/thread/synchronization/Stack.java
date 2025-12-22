package org.java.thread.synchronization;

/**
 * A simple stack implementation with synchronized push and pop methods to ensure thread safety.
 * <br/>
 * Note: Since we are using same lock object for both push and pop methods, only one thread can execute either of these methods at a time.
 * <br/>
 * E.g. Consider two threads T1 and T2 trying to push and pop respectively at the same time.
 * If T1 acquires the lock first, T2 will not able to execute both {@code push} and {@code pop()} methods since both the methods have the same lock.
 */
public class Stack {
    private final int[] stackArray;
    private int top;
    private final Object lock;

    public Stack(int size) {
        stackArray = new int[size];
        top = -1;
        this.lock = new Object();
    }

    public boolean push(int value) {
        // For a synchronized block, the lock object can be any java object. Here we are using a dedicated lock object to synchronize stack operations.
        synchronized (lock) {
            if (isFull()) {
                return false; // Stack overflow
            }
            ++top;
            try {
                // Simulate some processing time
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            stackArray[top] = value;
            return true;
        }

    }

    public int pop() {
        synchronized (lock) {
            if (isEmpty())
                return Integer.MIN_VALUE;

            int topValue = stackArray[top];
            stackArray[top] = Integer.MIN_VALUE;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            top--;
            return topValue;
        }

    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top >= stackArray.length - 1;
    }
}
