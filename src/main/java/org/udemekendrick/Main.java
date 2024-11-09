package org.udemekendrick;

import org.udemekendrick.linkedList.singlyLinkedList.SinglyLinkedList;
import org.udemekendrick.topTenCodingQuestions.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSinglyLinkedList(1);
        System.out.print(singlyLinkedList.head.value + " --> ");
        singlyLinkedList.insertInLinkedList(2, 1);
        singlyLinkedList.insertInLinkedList(3, 3);
        System.out.print(singlyLinkedList.head.next.value + " --> ");
        System.out.println(singlyLinkedList.head.next.next.value);
    }
}
