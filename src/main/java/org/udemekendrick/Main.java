package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseFifteen;
import org.udemekendrick.arrays.exercises.ExerciseSixteen;
import org.udemekendrick.topTenCodingQuestions.QuestionOne;
import org.udemekendrick.topTenCodingQuestions.QuestionTwo;

public class Main {
    public static void main(String[] args) {
        QuestionTwo questionTwo = new QuestionTwo();
        int[] array1 = {4, 5, 6, 7, 9, 3, 8,};
        int result = questionTwo.largestNumber(array1);
        System.out.println(result);
    }
}
