package org.udemekendrick;

import org.udemekendrick.topTenCodingQuestions.QuestionFive;
import org.udemekendrick.topTenCodingQuestions.QuestionFour;
import org.udemekendrick.topTenCodingQuestions.QuestionSix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuestionSix questionSix = new QuestionSix();
        String inputString = "omo";
//        int[] array1 = {4, 5, 6, 7, 9, 3, 8,};
//        int[] array2 = {7, 3, 9, 4, 8, 1, 2,};
        boolean result = questionSix.isPalindrome(inputString);
        System.out.println(result);
    }
}
