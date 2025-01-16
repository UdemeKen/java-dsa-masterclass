package org.udemekendrick;

import org.udemekendrick.linkedList.Node;
import org.udemekendrick.linkedList.circularSinglyLinkedList.CircularSinglyLinkedList;
import org.udemekendrick.linkedList.exercise.GetExercise;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList(null, null);
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(3, 2);
        csll.insertCSLL(2, 1);
        csll.insertCSLL(6, 5);
        csll.traverseCSLL();
        csll.searchNode(8);
    }
}
