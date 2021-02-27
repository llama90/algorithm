package com.github.lucaseo90;

public class No0326 {
    public static boolean isPowerOfThree(int n) {
        boolean isPower = false;

        if (n == 1) {
            isPower = true;
        } else {
            while (n > 0) {
                if (n % 3 != 0) {
                    break;
                }
                n /= 3;

                if (n == 1) {
                    isPower = true;
                    break;
                }
            }
        }
        return isPower;
    }
}
