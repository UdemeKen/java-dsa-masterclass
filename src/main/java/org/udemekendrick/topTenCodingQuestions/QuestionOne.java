package org.udemekendrick.topTenCodingQuestions;

// Write a function to calculate the sum of all elements in an array.

public class QuestionOne {

    public int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
