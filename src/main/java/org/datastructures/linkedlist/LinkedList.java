package org.datastructures.linkedlist;

public class LinkedList {
    Node head;

    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    public void insertBegin(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAt(int index, int value) {
        Node newNode = new Node(value);
        Node n = head;
        if (index == 0) {
            insertBegin(value);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            newNode.next = n.next;
            n.next = newNode;
        }
    }

    public void deleteAt(int index) {
        Node n = head;
        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n.next = n.next.next;
        }
    }

    public void show() {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }

    public int size() {
        int len = 0;
        Node n = head;
        while (n != null) {
            len++;
            n = n.next;
        }
        return len;
    }
}
