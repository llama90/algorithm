package com.github.lucaseo90.interview.array;

public class No0283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int index = -1;
            if (nums[i] == 0) {
                index = i;
            }

            if (index != -1) {
                for (int j = i + 1; j < size; j++) {
                    if (nums[j] != 0) {
                        nums[index] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}
