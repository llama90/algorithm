package com.github.lucaseo90.interview.string;

public class No0344_ReverseString {
    public void reverseString(char[] s) {
        int size = s.length;
        for (int i = 0; i < size / 2; i++) {
            char left = s[i];
            char right = s[size - 1 - i];

            s[i] = right;
            s[size - 1 - i] = left;
        }
    }
}
