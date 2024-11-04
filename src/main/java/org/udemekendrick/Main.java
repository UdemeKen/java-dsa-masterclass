package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseOne;
import org.udemekendrick.arrays.exercises.ExerciseThree;
import org.udemekendrick.arrays.exercises.ExerciseTwo;
import org.udemekendrick.arrays.projects.AverageTemperature;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseThree exerciseThree = new ExerciseThree();
        int[] array = {9, 8, 7, 6, 5};
        int[] result = exerciseThree.findTopTwoScores(array);
        System.out.println(Arrays.toString(result));
    }
}
