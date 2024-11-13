package org.udemekendrick.arrays.exercise;

// Given an image represented by NxN matrix write a method to rotate the image by 90 degrees.
// You have to rotate the image in place, which means you have to modify the input 2D matrix directly.
// Do not allocate another 2D matrix and do the rotation.

public class ExerciseThirteen {

    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }
    }
    public static void reverseRow(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right++;
        }
    }
}
