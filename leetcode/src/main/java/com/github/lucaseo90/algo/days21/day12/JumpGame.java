package com.github.lucaseo90.algo.days21.day12;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxPosition = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int jump = nums[i];
            if (i > maxPosition) {
                return false;
            }
            maxPosition = Math.max(maxPosition, i + jump);
        }
        return true;
    }
}
