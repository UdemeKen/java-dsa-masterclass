package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseOne;
import org.udemekendrick.arrays.exercises.ExerciseTwo;
import org.udemekendrick.arrays.projects.AverageTemperature;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseTwo exerciseTwo = new ExerciseTwo();
        int[][] array = {{1, 2, 3, 4}, {4, 3, 2, 1}, {9, 8, 7, 6, 5}};
        int result = exerciseTwo.sumDiagonalElements(array);
        System.out.println(result);
    }
}
