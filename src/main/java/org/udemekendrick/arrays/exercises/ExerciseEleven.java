package org.udemekendrick.arrays.exercises;

// Write a program to check if an array is unique or not.

import java.util.HashSet;

public class ExerciseEleven {

    public boolean isUnique(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }
}
