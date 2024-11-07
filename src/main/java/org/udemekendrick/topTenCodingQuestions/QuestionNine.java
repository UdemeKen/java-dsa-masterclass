package org.udemekendrick.topTenCodingQuestions;

// Write a function to calculate the fibonacci sequence up to a given number.

public class QuestionNine {

    public void generateFibonacci(int num) {
        int a = 0, b = 1;
        System.out.print(+ a + ", " + b);
        for (int i = 0; i < num; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }
}
