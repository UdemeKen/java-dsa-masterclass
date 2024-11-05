package org.udemekendrick;

import org.udemekendrick.arrays.exercises.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseEleven exerciseEleven = new ExerciseEleven();
        int[] array = {4, 5, 6, 7, 9, 3, 8,};
        boolean result = exerciseEleven.isUnique(array);
        System.out.println(result);
    }
}
