package org.udemekendrick.arrays.exercises;

// Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

import java.util.Arrays;

public class ExerciseFive {

    public int[] removeDuplicates(int[] array) {
        if (array.length == 0) {
            return array;
        }

        Arrays.sort(array);
        int arrayLength = array.length;
        int[] newArray = new int[arrayLength];
        int newIndex = 0;
        newArray[newIndex++] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                newArray[newIndex++] = array[i];
            }
        }
        return Arrays.copyOf(newArray, newIndex);
    }
}
