package org.udemekendrick;

import org.udemekendrick.linkedList.Node;
import org.udemekendrick.linkedList.exercise.GetExercise;

public class Main {
    public static void main(String[] args) {
        GetExercise getExercise = new GetExercise();
        getExercise.push(20);
        getExercise.push(30);
        getExercise.push(40);
        getExercise.push(50);
        Node result = getExercise.get(3);
        System.out.println(result);
    }
}
