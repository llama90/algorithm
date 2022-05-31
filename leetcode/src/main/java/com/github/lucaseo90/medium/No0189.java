package com.github.lucaseo90.medium;

public class No0189 {
    public int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] rotated = new int[nums.length];
        for (int i = 0; i < k; i++) {
            rotated[i] = nums[nums.length - k + i];
        }
        for (int i = k; i < nums.length; i++) {
            rotated[i] = nums[i - k];
        }
        for (int i = 0;i < nums.length; i++) {
            nums[i] = rotated[i];
        }
        return nums;
    }
}
