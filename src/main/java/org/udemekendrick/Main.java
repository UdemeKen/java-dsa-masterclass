package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseFour;

public class Main {
    public static void main(String[] args) {
        ExerciseFour exerciseFour = new ExerciseFour();
        int[] array = {4, 5, 6, 7, 9};
        int result  = exerciseFour.findMissingNumberInArray(array);
        System.out.println(result);
    }
}
