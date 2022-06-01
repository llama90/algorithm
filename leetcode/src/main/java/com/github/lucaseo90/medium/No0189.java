package com.github.lucaseo90.medium;

public class No0189 {
    public int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        int left = 0;
        int right = nums.length - 1;

        swap(nums, left, right);
        swap(nums, 0, k - 1);
        swap(nums, k, nums.length - 1);

        return nums;
    }

    public void swap(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
