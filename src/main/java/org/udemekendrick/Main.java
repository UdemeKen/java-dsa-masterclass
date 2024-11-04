package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseFive;
import org.udemekendrick.arrays.exercises.ExerciseFour;
import org.udemekendrick.arrays.exercises.ExerciseSix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseSix exerciseSix = new ExerciseSix();
        int[] array = {4, 5, 6, 6, 7, 9, 9, 3, 8, 8};
        int result = exerciseSix.removeDuplicatesTwo(array);
        System.out.println(result);
    }
}
