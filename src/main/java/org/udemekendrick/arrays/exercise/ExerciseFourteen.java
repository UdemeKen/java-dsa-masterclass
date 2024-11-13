package org.udemekendrick.arrays.exercise;

// Create a function which calculate the sum and products of elements of array.
// Find the time complexity for created method.

public class ExerciseFourteen {

    public void sumProductOfArray(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }
}
