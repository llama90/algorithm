package com.github.lucaseo90.ds.day01.array;

import java.util.HashMap;

public class No0001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] answer = null;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                answer = new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return answer;
    }
}
