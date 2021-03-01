package com.github.lucaseo90;

import java.util.ArrayList;

public class No0377 {
    private int candidateSum = 0;

    public int combinationSum4(int[] nums, int target) {
        candidateSum = 0;
        int size = nums.length;
        for (int i = 1; i <= target; i++) {
            combination(nums, size, i, target, 0, new ArrayList<>());
        }
        return candidateSum;
    }

    public void combination(int[] nums, int n, int r, int target, int currentSum, ArrayList<Integer> element) {
        if (element.size() == r) {
            if (currentSum == target) {
                candidateSum++;
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (currentSum <= target) {
                element.add(nums[i]);
                combination(nums, n, r, target, currentSum + nums[i], element);
                element.remove(element.size() - 1);
            }
        }
    }

}
