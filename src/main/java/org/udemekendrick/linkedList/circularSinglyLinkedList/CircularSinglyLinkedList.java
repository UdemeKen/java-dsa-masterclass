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
}
