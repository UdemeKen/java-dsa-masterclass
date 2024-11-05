package org.udemekendrick.arrays.exercises;

// You're given two integer arrays. Write a program to check if they are permutation of each other

import java.util.Arrays;

public class ExerciseTwelve {

    public boolean permutation(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return  false;
            }
        }
        return  true;
    }
}
