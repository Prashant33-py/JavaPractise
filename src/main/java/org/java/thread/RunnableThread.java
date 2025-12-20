package org.java.thread;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5;i++){
            System.out.println("Inside " +Thread.currentThread().getName()+ " : "+ i);
        }
    }
}
