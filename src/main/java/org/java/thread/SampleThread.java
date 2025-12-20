package org.java.thread;

public class SampleThread extends Thread{

    public SampleThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5;i++){
            System.out.println("Inside " +Thread.currentThread().getName()+ " : "+ i);
        }
    }
}
