package com.github.lucaseo90.interview.string;

import java.util.Arrays;

public class No0242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        boolean isAnagram = true;
        for (int i = 0; i < sCharArray.length; i++) {
            if (sCharArray[i] != tCharArray[i]) {
                isAnagram = false;
            }
        }

        return isAnagram;
    }
}
