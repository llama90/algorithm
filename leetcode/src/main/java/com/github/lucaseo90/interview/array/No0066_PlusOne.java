package com.github.lucaseo90.interview.array;

public class No0066_PlusOne {
    public int[] plusOne(int[] digits) {
        int temp = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 > 9) {
                digits[i] = 0;
                if (i == 0) {
                    temp = 1;
                }
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }

        if (temp == 1) {
            int[] overflowDigits = new int[digits.length + 1];
            overflowDigits[0] = temp;
            for (int i = 1; i < digits.length; i++) {
                overflowDigits[i] = digits[i - 1];
            }
            return overflowDigits;
        } else {
            return digits;
        }
    }
}
