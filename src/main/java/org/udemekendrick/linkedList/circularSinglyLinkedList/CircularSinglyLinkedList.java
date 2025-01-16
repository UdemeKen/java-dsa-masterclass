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
            System.out.println("");
        } else {
            System.out.println("\n CSLL does not exist!");
        }
    }

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found node at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
            return;
        }
        if (location == 0) {
            head = head.next;
            tail = head;
            size--;
            if (size == 0) {
                head.next = null;
                tail = head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteCSLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
            return;
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL is successfully deleted!");
        }
    }
}
