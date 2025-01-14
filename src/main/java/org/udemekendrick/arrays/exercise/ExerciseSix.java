package org.udemekendrick.arrays.exercise;

// Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
// Do not allocate extra space for another array; you must do this by modifying the new input array in place with 0(1)

public class ExerciseSix {

    public int removeDuplicatesTwo(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int uniqueIndex = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[uniqueIndex] = array[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}
