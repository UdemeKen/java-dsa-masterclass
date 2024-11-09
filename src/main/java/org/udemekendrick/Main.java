package org.udemekendrick;

import org.udemekendrick.linkedList.singlyLinkedList.SinglyLinkedList;
import org.udemekendrick.topTenCodingQuestions.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSinglyLinkedList(5);
        System.out.println(singlyLinkedList.head.value);
    }
}
