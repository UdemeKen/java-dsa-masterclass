package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseFifteen;
import org.udemekendrick.arrays.exercises.ExerciseSixteen;
import org.udemekendrick.topTenCodingQuestions.QuestionOne;
import org.udemekendrick.topTenCodingQuestions.QuestionThree;
import org.udemekendrick.topTenCodingQuestions.QuestionTwo;

public class Main {
    public static void main(String[] args) {
        QuestionThree questionThree = new QuestionThree();
        int[] array1 = {4, 5, 6, 7, 9, 3, 8,};
        int result = questionThree.secondLargestNumber(array1);
        System.out.println(result);
    }
}
