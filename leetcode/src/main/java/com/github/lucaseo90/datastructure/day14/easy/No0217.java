package com.github.lucaseo90.datastructure.day14.easy;

import java.util.HashMap;
import java.util.Map;

public class No0217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                return true;
            } else {
                count.put(nums[i], 1);
            }
        }
        return false;
    }
}
