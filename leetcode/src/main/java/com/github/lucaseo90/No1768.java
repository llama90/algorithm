package com.github.lucaseo90;

public class No1768 {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();

        int word1Index = 0;
        int word2Index = 0;
        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if (i % 2 == 0 && word1Index < word1.length()) {
                mergedString.append(word1.charAt(word1Index++));
            } else if (i % 2 == 1 && word2Index < word2.length()) {
                mergedString.append(word2.charAt(word2Index++));

            } else if (word1Index < word1.length()) {
                mergedString.append(word1.charAt(word1Index++));
            } else if (word2Index < word2.length()) {
                mergedString.append(word2.charAt(word2Index++));
            }
        }
        return mergedString.toString();
    }

}
