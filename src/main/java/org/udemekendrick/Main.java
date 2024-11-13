package org.udemekendrick;

import org.udemekendrick.linkedList.exercise.PushExercise;
import org.udemekendrick.linkedList.singlyLinkedList.SinglyLinkedList;
import org.udemekendrick.topTenCodingQuestions.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PushExercise pushExercise = new PushExercise();
        pushExercise.push(20);
        System.out.println(pushExercise.head.value);
    }
}
