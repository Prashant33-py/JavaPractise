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
            if (queue.size() == capacity) {
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
            if (queue.isEmpty()) {
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
