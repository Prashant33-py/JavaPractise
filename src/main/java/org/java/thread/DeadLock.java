package org.java.thread;

public class DeadLock {

    public static void main(String[] args) {
        Object lock1 = "lock1";
        Object lock2 = "lock2";
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                    synchronized (lock2) {
                        System.out.println("lock 2 acquired");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }, "thread1");
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                    synchronized (lock1) {
                        System.out.println("lock 1 acquired");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }, "thread2");

        thread1.start();
        thread2.start();
    }


}
