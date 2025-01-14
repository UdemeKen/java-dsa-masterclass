package org.udemekendrick.arrays.exercise;

// Write a Java function called "findMissingNumberInArray" that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number,
// and returns the missing number.

public class ExerciseFour {

    public int findMissingNumberInArray (int[] array) {
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
