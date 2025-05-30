package org.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList customList = new LinkedList();
        customList.insert(5);
        customList.insert(6);
        customList.insert(7);
        customList.insert(8);
        customList.insert(9);
        customList.insert(10);

        customList.show();

        customList.insertBegin(23);
        customList.show();

    }
}
