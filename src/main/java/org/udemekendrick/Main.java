package org.udemekendrick;

import org.udemekendrick.topTenCodingQuestions.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuestionEight questionEight = new QuestionEight();
        int num = 5;
        long result = questionEight.factorial(num);
        System.out.println(result);
    }
}
