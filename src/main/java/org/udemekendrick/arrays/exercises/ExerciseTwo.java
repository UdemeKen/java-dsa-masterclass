package org.udemekendrick.arrays.exercises;

public class ExerciseTwo {

    public int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
