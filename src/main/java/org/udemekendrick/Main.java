package org.udemekendrick;

import org.udemekendrick.linkedList.Node;
import org.udemekendrick.linkedList.circularSinglyLinkedList.CircularSinglyLinkedList;
import org.udemekendrick.linkedList.exercise.GetExercise;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList(null, null);
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        System.out.println(csll.head.value);
    }
}
