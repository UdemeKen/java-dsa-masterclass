package org.udemekendrick.arrays.exercise;

// Given an array of integers "nums" and an integer "target", return indices of two numbers such that they add up to target. You may assume that each input would have exactly
// one solution, and you may not use the same element twice.

import java.util.HashMap;

public class ExerciseEight {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
