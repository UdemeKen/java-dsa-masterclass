package org.udemekendrick;

import org.udemekendrick.arrays.exercises.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseNine exerciseNine = new ExerciseNine();
        int[] array = {4, -5, 6, 6, -7, 9, 9, -3, -8, 8, -1000};
        int valueToSearch = 6;
        int result = exerciseNine.searchInArray(array, valueToSearch);
        System.out.println(result);
    }
}
