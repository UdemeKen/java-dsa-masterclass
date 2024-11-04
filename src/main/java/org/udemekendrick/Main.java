package org.udemekendrick;

import org.udemekendrick.arrays.exercises.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExerciseEight exerciseEight = new ExerciseEight();
        int[] nums = {4, -5, 6, 6, -7, 9, 9, -3, -8, 8, -1000};
        int target = 6;
        int[] result  = exerciseEight.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
