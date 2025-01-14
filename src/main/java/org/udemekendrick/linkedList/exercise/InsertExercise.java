package org.udemekendrick.linkedList.exercise;

// Implement the following on the singly linked list class
// INSERT
// This function should insert a node at a specified index in a SinglyLinkedList. It should return true if the index is valid, and false if the index is invalid.
// (less than 0 or greater the length of the list).

import org.udemekendrick.linkedList.Node;

public class InsertExercise {
    public Node head;
    public Node tail;
    public int size;

    public InsertExercise() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node insertSinglyLinkedList(int nodeValue) {
        Node node = new Node(nodeValue);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void push(int nodeValue) {
        if (head == null) {
            insertSinglyLinkedList(nodeValue);
        } else {
            Node newNode = new Node(nodeValue);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public boolean insert(int data, int index) {
        if (index < 0 || index > size) {
            return false;
        }
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
                    if (size == 0) {
                        tail = newNode;
                    }
        } else if (index == size) {
           tail.next = newNode;
           tail = newNode;
        } else {
            Node tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size++;
        return  true;
    }
}
