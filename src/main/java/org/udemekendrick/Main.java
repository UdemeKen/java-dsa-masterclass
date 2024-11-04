package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseFive;
import org.udemekendrick.arrays.exercises.ExerciseFour;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseFive exerciseFive = new ExerciseFive();
        int[] array = {4, 5, 6, 6, 7, 9, 9, 3, 8, 8};
        int[] result = exerciseFive.removeDuplicates(array);
        System.out.println(Arrays.toString(result));
    }
}
