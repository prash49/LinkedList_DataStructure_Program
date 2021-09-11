package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.linkedlist.Node;

public class Stack {
    private Node top;
    private LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    public void push() {
        linkedList.push(70);
        linkedList.push(30);
        top = linkedList.push(56);
//        linkedList.print();
    }


    public void peek() {
        push();
        System.out.println("\nTop element is " + this.top.data);
    }

    public void pop() {
        System.out.println("Before");
        linkedList.print();
        push();
        Node temp = top;
        while (temp != null) {
            linkedList.pop();
            temp = temp.next;
        }
        System.out.println("after");
        linkedList.print();
    }
}