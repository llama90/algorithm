package com.github.lucaseo90;

import java.util.ArrayList;

public class No0009 {
    public static boolean isPalindrome(int x) {
        boolean isPalindrome;
        if (x < 0) {
            isPalindrome = false;
        } else {
            isPalindrome = true;
            ArrayList<Integer> xList = new ArrayList<>();
            while (x > 0) {
                int remain = x % 10;
                x = x / 10;
                xList.add(remain);
            }

            for (int i = 0; i < xList.size() / 2; i++) {
                if (xList.get(i) != xList.get(xList.size() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

        }
        return isPalindrome;
    }
}
