package com.github.lucaseo90;

public class No0238 {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] product = new int[length];

        int[] toRight = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                toRight[i] = 1;
            } else {
                toRight[i] = nums[i - 1] * toRight[i - 1];
            }
        }

        int[] toLeft = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            if (i == length - 1) {
                toLeft[i] = 1;
            } else {
                toLeft[i] = nums[i + 1] * toLeft[i + 1];
            }
        }

        for (int i = 0; i < length; i++) {
            product[i] = toRight[i] * toLeft[i];
        }

        return product;
    }

}
