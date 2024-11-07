package org.udemekendrick;

import org.udemekendrick.topTenCodingQuestions.QuestionFive;
import org.udemekendrick.topTenCodingQuestions.QuestionFour;
import org.udemekendrick.topTenCodingQuestions.QuestionSeven;
import org.udemekendrick.topTenCodingQuestions.QuestionSix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuestionSeven question = new QuestionSeven();
        String inputString1 = "silent";
        String inputString2 = "listen";
//        int[] array1 = {4, 5, 6, 7, 9, 3, 8,};
//        int[] array2 = {7, 3, 9, 4, 8, 1, 2,};
        boolean result = question.anagrams(inputString1, inputString2);
        System.out.println(result);
    }
}
