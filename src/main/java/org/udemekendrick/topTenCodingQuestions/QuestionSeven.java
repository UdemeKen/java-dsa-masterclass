package org.udemekendrick.topTenCodingQuestions;

// Write a function that checks whether two strings are anagrams or not.

import java.util.Arrays;

public class QuestionSeven {

    public boolean anagrams(String input1, String input2) {
        char[] newArray1 = input1.toCharArray();
        char[] newArray2 = input2.toCharArray();
        Arrays.sort(newArray1);
        Arrays.sort(newArray2);
        return Arrays.equals(newArray1, newArray2);
    }
}
