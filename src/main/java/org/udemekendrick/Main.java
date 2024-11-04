package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseOne;
import org.udemekendrick.arrays.projects.AverageTemperature;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseOne exerciseOne = new ExerciseOne();
        int[] array = {1, 2, 3, 4};
        int[] result = exerciseOne.middle(array);
        System.out.println(Arrays.toString(result));
    }
}
