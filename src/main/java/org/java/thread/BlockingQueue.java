package org.java.thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This is a blocking queue.<br/>
 *
 * In this queue, whenever we <br/>
 * <ul>
 * <li>Add - If the queue is not full, the thread group can add the elements without any issue.
 * But when the queue capacity is full, the next thread which tries to add the element has to wait till the remove related thread performs the remove operation.
 * Once the removal is done, the add thread will be notified</li>
 * <li>Remove - If the queue is not empty, the thread group can remove the elements without any issue.
 * But when the queue is empty, the next thread which tries to remove the element has to wait till the add related thread performs the add operation.
 * Once the addition is done, the remove thread will be notified</li>
 * <ul/>
 */
public class BlockingQueue {
    private final Queue<Integer> queue;
    private final int capacity;

    public BlockingQueue(int capacity) {
        queue = new LinkedList<Integer>();
        this.capacity = capacity;
    }

    public boolean add(int val){
        synchronized (queue) {
            /*
             * The reason for using while instead of if condition:
             * Consider 2 adder threads a1 and a2 and 1 removal thread r1.
             * When the capacity is full and a1 thread starts executing, it will have to wait and same for a2 as well.
             * Once the r1 thread is executed creating an empty space, it will be notified to all the threads.
             * Now when the a1 thread is called, it will execute the further steps i.e. adding the new value.
             * If a2 will also start the execution but since the capacity is already full, it will still try to add the element and as a result will not be able to do so.
             * Now if we use while loop instead of if condition, thread t2 will now check the condition inside the while() - since it is a loop and then will start waiting.
             *
             */
            while (queue.size() == capacity) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.add(val);
            queue.notify();
             return true;
        }
    }

    public int remove(){
        synchronized (queue) {
            while (queue.isEmpty()) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int val = queue.poll();
            queue.notifyAll();
            return val;
        }
    }

}
