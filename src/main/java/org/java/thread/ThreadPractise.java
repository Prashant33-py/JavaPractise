package org.java.thread;

import org.java.thread.synchronization.Stack;

public class ThreadPractise {

    public static void main(String[] args) {
        System.out.println("Main thread started");

        //Way 1: Extending Thread class
        Thread thread1 = new SampleThread("cThread");
        thread1.start();

        //Way 2: Implementing Runnable interface
        //This way is preferred as Java supports only single inheritance and by implementing Runnable we can still extend another class/implement other interfaces
        // Thread runnableThread = new Thread(new RunnableThread(), "runnableCThread");

        // Using a lambda expression to implement Runnable interface. This will help to reduce boilerplate code like creating a separate class implementing Runnable interface
        Thread runnableThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Inside lambda function's " + Thread.currentThread().getName() + " : " + i);
            }
        }, "lambdaRunnableCThread");
        runnableThread.start();

        //Synchronization example: Stack
        // Two threads pushing and popping from the same stack instance may throw exception(s) since stack operations are not synchronized
        Stack cStack = new Stack(5);
        new Thread(() -> {
            int counter = 0;
            while (++counter < 10) {
                System.out.println("Pushed: "+cStack.push(100));
            }
        }, "PushThread").start();

        new Thread(() -> {
            int counter = 0;
            while (++counter < 10) {
                System.out.println("Popped: "+cStack.pop());
            }
        }, "PopThread").start();

        System.out.println("Main thread finished");
    }

}
