package org.udemekendrick;

import org.udemekendrick.arrays.exercises.ExerciseFive;
import org.udemekendrick.arrays.exercises.ExerciseFour;
import org.udemekendrick.arrays.exercises.ExerciseSeven;
import org.udemekendrick.arrays.exercises.ExerciseSix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseSeven exerciseSeven = new ExerciseSeven();
        int[] prices = {4, -5, 6, 6, -7, 9, 9, -3, -8, 8, -1000};
        int result = exerciseSeven.maxProfit(prices);
        System.out.println(result);
    }
}
