package com.github.lucaseo90;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class No0003 {

    private final int numberOfAscii = 128;

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();

        boolean[][] duplicationMap = new boolean[s.length()][numberOfAscii];
        int[] substringCount = new int[s.length()];
        int longestSubstringCount = 0;

        for (int i = 0; i < length; i++) {
            for (int j = s.length() - 1 - i; j >= 0; j--) {
                int characterIndex = s.charAt(j);
                if (duplicationMap[i][characterIndex] == false) {
                    duplicationMap[i][characterIndex] = true;
                    substringCount[i]++;
                } else {
                    break;
                }
            }

            if (substringCount[i] > longestSubstringCount) {
                longestSubstringCount = substringCount[i];
            }
        }
        return longestSubstringCount;
    }
}
