package org.udemekendrick.arrays.exercises;

// Create a method which takes an array as a parameter and reverse it.
// Find the runtime of the created method?

import java.util.Arrays;

public class ExerciseSixteen {

    public void reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int other = array.length - i -1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
