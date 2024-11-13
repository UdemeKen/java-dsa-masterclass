package org.udemekendrick.arrays.exercise;

// Write a program to check if an array contains a number in java.

public class ExerciseNine {

    public int searchInArray(int[] array, int valueToSearch) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToSearch) {
                index = i;
            }
        }
        return index;
    }
}
