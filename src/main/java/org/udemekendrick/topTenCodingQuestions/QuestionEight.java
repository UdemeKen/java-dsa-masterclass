package org.udemekendrick.topTenCodingQuestions;

// Write a function to calculate the factorial of a number.

public class QuestionEight {

    public long factorial(int num) {
        if (num == 0) {
            return 1;
        }
        int result  = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
