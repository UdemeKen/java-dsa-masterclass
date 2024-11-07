package org.udemekendrick;

import org.udemekendrick.topTenCodingQuestions.QuestionFive;
import org.udemekendrick.topTenCodingQuestions.QuestionFour;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuestionFive questionFive = new QuestionFive();
        String inputString = "Udeme Kendrick";
//        int[] array1 = {4, 5, 6, 7, 9, 3, 8,};
//        int[] array2 = {7, 3, 9, 4, 8, 1, 2,};
        String result = questionFive.reverseString(inputString);
        System.out.println(result);
    }
}
