package com.github.lucaseo90;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class No0442 {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> twiceValue = new LinkedList<>();

        int size = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (set.contains(nums[i])) {
                twiceValue.add(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        return twiceValue;
    }

}
