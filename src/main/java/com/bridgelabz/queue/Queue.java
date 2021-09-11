package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.linkedlist.Node;


public class Queue {
    private Node top;
    private com.bridgelabz.linkedlist.LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
    }

    public void enqueue() {
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
}