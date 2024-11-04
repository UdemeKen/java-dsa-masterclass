package org.udemekendrick.arrays.exercises;

//Given an array, write a function to get first, second best scores from the array and return it in new array.
// Array may contain duplicates.

import java.util.Arrays;

public class ExerciseThree {

public int[] findTopTwoScores(int[] array) {
    Arrays.sort(array);
    int[] newArray = new int[2];
    newArray[0] = array[array.length - 1];
    newArray[1] = array[array.length - 2];
    return  newArray;
}
}
