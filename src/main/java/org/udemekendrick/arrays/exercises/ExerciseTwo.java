package org.udemekendrick.arrays.exercises;

// Given a 2D array, calculate the sum of the diagonal elements.

public class ExerciseTwo {

    public int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
