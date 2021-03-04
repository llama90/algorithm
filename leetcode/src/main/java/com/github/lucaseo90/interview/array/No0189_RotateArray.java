package com.github.lucaseo90.interview.array;

public class No0189_RotateArray {

    public void rotate(int[] nums, int k) {
        int[] temp = new int[k];
        int size = nums.length;
        k = k % size;

        for (int i = 0; i < k; i++) {
            temp[i] = nums[size - k + i];
        }

        for (int i = size - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

}
