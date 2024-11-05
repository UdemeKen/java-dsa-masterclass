package org.udemekendrick;

import org.udemekendrick.arrays.exercises.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseTen exerciseTen = new ExerciseTen();
        int[] array = {4, 5, 6, 7, 9, 3, 8,};
        String result = exerciseTen.maxProduct(array);
        System.out.println(result);
    }
}
