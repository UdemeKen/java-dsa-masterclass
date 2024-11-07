package org.udemekendrick;

import org.udemekendrick.topTenCodingQuestions.QuestionFour;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuestionFour questionFour = new QuestionFour();
        int[] array1 = {4, 5, 6, 7, 9, 3, 8,};
        int[] array2 = {7, 3, 9, 4, 8, 1, 2,};
        int[] result = questionFour.mergedArray(array1, array2);
        System.out.println(Arrays.toString(result));
    }
}
