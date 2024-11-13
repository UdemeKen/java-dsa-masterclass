package org.udemekendrick.linkedList.singlyLinkedList;

import org.udemekendrick.linkedList.Node;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node(nodeValue);
        Node node = new Node(nodeValue);
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

//    Insert Method in SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node(nodeValue);
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location -1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

//    SinglyLinkedList Traversal
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("Singly linked list does not exist!");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("=>");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

//    Search for a node
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node at location: " +i+ "\n");
                    return true;
                } else {
                    tempNode = tempNode.next;
                }
            }
        }
        System.out.println("Node not found! ");
        return false;
    }

//    Deleting a node from singly linked list
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("The singly linked list does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
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

//    Delete entire singly linked list
    public void deleteSinglyLinkedList() {
        head = null;
        tail = null;
        System.out.println("THe singly linked list deleted successfully!");
    }
}
