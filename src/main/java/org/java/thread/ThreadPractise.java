package org.java.thread;

public class ThreadPractise {

    public static void main(String[] args) {
        System.out.println("Main thread started");

        //Way 1: Extending Thread class
        Thread thread1 = new SampleThread("cThread");
        thread1.start();

        //Way 2: Implementing Runnable interface
        //This way is preferred as Java supports only single inheritance and by implementing Runnable we can still extend another class/implement other interfaces
        Thread runnableThread = new Thread(new RunnableThread(), "runnableCThread");
        runnableThread.start();

        System.out.println("Main thread finished");
    }

}
