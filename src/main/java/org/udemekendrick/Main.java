package org.udemekendrick;

import org.udemekendrick.linkedList.exercise.InsertExercise;
import org.udemekendrick.linkedList.exercise.PushExercise;

public class Main {
    public static void main(String[] args) {
        InsertExercise insertExercise = new InsertExercise();
        insertExercise.insertSinglyLinkedList(10);
        insertExercise.push(20);
        insertExercise.push(30);
        insertExercise.push(40);
        insertExercise.push(50);
        System.out.println(insertExercise.insert(5,0));
    }
}
