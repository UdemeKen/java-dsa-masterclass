package org.udemekendrick.topTenCodingQuestions;

// Write a function to find the second-largest number in an array.

import java.util.Arrays;

public class QuestionThree {

    public int secondLargestNumber(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        Arrays.sort(array);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (largest < array[i]) {
                secondLargest = largest;
                largest = array[i];
            }
        }
        return secondLargest;
    }
}
