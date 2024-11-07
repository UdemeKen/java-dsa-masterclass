package org.udemekendrick.topTenCodingQuestions;

// Write a function if a given string is palindrome or not.

public class QuestionSix {

    public boolean isPalindrome(String inputString) {
        StringBuilder reverse = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse.append(inputString.charAt(i));
        }
        String newString = reverse.toString();
        if (inputString.equals(newString)) {
            return  true;
        } else {
            return false;
        }
    }
}
