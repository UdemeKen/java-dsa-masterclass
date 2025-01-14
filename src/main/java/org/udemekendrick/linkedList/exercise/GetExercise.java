package org.udemekendrick.linkedList.exercise;

// SINGLYLINKEDLIST - GET
// Implement the following on the SInglyLinkedList class:
// Get
// THis function should find a node at a specific index in a singly linked list. It should return the found node.

import org.udemekendrick.linkedList.Node;

public class GetExercise {
    public Node head;
    public Node tail;
    public int size;

    public GetExercise() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(int nodeValue) {
        Node newNode = new Node(nodeValue);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node get(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        Node current = head;
        int counter = 0;
        while (counter < index) {
            current = current.next;
            counter++;
        }
        return current;
    }
}
