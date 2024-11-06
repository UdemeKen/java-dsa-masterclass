package org.udemekendrick.arrays.exercises;

// Create a function which prints to the console the pairs from given array.
// Find the time complexity for created method

public class ExerciseFifteen {

    public void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i] + "" + array[j] + " ");
            }
        }
    }
}
