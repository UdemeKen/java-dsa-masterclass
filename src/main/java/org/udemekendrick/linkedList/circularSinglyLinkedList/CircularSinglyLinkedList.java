package org.udemekendrick.linkedList.circularSinglyLinkedList;

import org.udemekendrick.linkedList.Node;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 1/14/2025
 */
public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public CircularSinglyLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    public Node createCSLL(int nodeValue) {
        head = new Node(nodeValue);
        Node node = new Node(nodeValue);
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCSLL(int nodeValue, int location) {
        Node newNode = new Node(nodeValue);
        if (head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        } else if (location >= size) {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size++;
    }

    public void traverseCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("-->");
                }
                tempNode = tempNode.next;
            }
            System.out.print("");
        } else {
            System.out.println("\n CSLL does not exist!");
        }
    }
}
