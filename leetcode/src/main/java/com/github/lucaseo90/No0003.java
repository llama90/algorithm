package com.github.lucaseo90;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class No0003 {

    private final int numberOfAscii = 128;

    public int lengthOfLongestSubstring(String s) {
        int longestSubstringCount = 0;

        int length = s.length();
        for (int i = 0; i < length; i++) {
            boolean[] duplicationCheck = new boolean[numberOfAscii];
            int subStringCount = 0;
            for (int j = s.length() - 1 - i; j >= 0; j--) {
                int characterIndex = s.charAt(j);
                if (duplicationCheck[characterIndex] == false) {
                    duplicationCheck[characterIndex] = true;
                    subStringCount++;
                } else {
                    break;
                }
            }

            if (subStringCount > longestSubstringCount) {
                longestSubstringCount = subStringCount;
            }
        }
        return longestSubstringCount;
    }
}
