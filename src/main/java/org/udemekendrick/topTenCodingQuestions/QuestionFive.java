package org.udemekendrick.topTenCodingQuestions;

// Write a function that returns the reverse of a string.

public class QuestionFive {

    public String reverseString(String inputString) {
        if (inputString == null) {
            return null;
        }
        StringBuilder reverse = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse.append(inputString.charAt(i));
        }
        return reverse.toString();
    }
}
