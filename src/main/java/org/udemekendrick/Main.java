package org.udemekendrick;

import org.udemekendrick.linkedList.singlyLinkedList.SinglyLinkedList;
import org.udemekendrick.topTenCodingQuestions.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSinglyLinkedList(1);
        singlyLinkedList.insertInLinkedList(2, 1);
        singlyLinkedList.insertInLinkedList(3, 2);
        singlyLinkedList.insertInLinkedList(4, 3);
        singlyLinkedList.insertInLinkedList(5, 4);
        singlyLinkedList.insertInLinkedList(6, 5);
        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.deletionOfNode(1);
        singlyLinkedList.traverseSinglyLinkedList();
    }
}
