package org.udemekendrick.topTenCodingQuestions;

// Write a function to find the largest number in an array

public class QuestionTwo {

    public int largestNumber(int[] array) {
        int largestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (largestNumber < array[i]) {
                largestNumber = array[i];
            }
        }
        return largestNumber;
    }
}
