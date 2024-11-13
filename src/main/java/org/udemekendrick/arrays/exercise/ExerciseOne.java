package org.udemekendrick.arrays.exercise;

// Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

public class ExerciseOne {

    public int[] middle(int[] array) {
        int size = array.length - 2;
        int[] newArray = new int[size];
        for (int i = 1; i < array.length - 1; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }
}
