package org.udemekendrick.arrays.exercise;

// How to find maximum product of two integers in the array where elements are positive.

public class ExerciseTen {

    public String maxProduct(int[] array) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] * array[j] > maxProduct) {
                    maxProduct = array[i] * array[j];
                    pairs = Integer.toString(array[i]) + ", " + Integer.toString(array[j]);
                }
            }
        }
        return pairs;
    }
}
