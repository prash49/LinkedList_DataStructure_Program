package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.linkedlist.Node;


public class Queue {
    private Node top;
     Node head;
    Node tail;
    private com.bridgelabz.linkedlist.LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
    }

    public void enqueue() {
       head = linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public void dequeue() {
        enqueue();
        top = head;
        Node temp = top;
        while (temp != null) {
            linkedList.pop();
            temp = temp.next;
        }
        System.out.println("After");
        linkedList.print();
    }
}
