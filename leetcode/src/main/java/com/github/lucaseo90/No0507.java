package com.github.lucaseo90;

public class No0507 {
    public static boolean checkPerfectNumber(int num) {
        boolean isPerfectNumber = false;

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            isPerfectNumber = true;
        }
        return isPerfectNumber;
    }
}
