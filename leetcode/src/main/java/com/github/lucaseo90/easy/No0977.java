package com.github.lucaseo90.easy;

public class No0977 {

    public int[] sortedSquares(int[] nums) {
        int[] square = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                square[right - left] = nums[left] * nums[left];
                left += 1;
            } else {
                square[right - left] = nums[right] * nums[right];
                right -= 1;
            }
        }

        return square;
    }
}
