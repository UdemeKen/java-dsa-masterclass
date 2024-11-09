package org.udemekendrick;

import org.udemekendrick.topTenCodingQuestions.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuestionTen questionTen = new QuestionTen();
        int[] num = {5, 1, 8, 4, 3, 7, 2};
        questionTen.bubbleSortArray(num);
        System.out.println(Arrays.toString(num));
    }
}
