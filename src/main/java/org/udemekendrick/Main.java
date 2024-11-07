package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseFifteen;
import org.udemekendrick.arrays.exercises.ExerciseSixteen;
import org.udemekendrick.topTenCodingQuestions.QuestionOne;

public class Main {
    public static void main(String[] args) {
        QuestionOne questionOne = new QuestionOne();
        int[] array1 = {4, 5, 6, 7, 9, 3, 8,};
        int result = questionOne.sumOfArrayElements(array1);
        System.out.println(result);
    }
}
