package org.udemekendrick.topTenCodingQuestions;

// Write a function to merge two arrays into a single sorted array.

import java.util.Arrays;

public class QuestionFour {

    public int[] mergedArray(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] newArray = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0; i < length2; i++) {
            newArray[length1 + i] = array2[i];
        }
        Arrays.sort(newArray);
        return newArray;
    }
}
