package org.udemekendrick.linkedList.exercise;

// Implement the following on the singlyLinkedList class:
// PUSH
// This function should take in a value and add node to the end of the value.

import org.udemekendrick.linkedList.Node;
import org.udemekendrick.linkedList.singlyLinkedList.SinglyLinkedList;

public class PushExercise {
    public Node head;
    public Node tail;
    public int size;

    public PushExercise() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
}
