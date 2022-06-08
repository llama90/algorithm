package com.github.lucaseo90.ds.day01.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class No0001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        List<Integer> twoNumber = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(target - nums[i])) {
                hashMap.put(nums[i], i);
            } else {
                int index = hashMap.get(target - nums[i]);
                twoNumber.add(index);
                twoNumber.add(i);
                break;
            }
        }

        int[] twoNumberArray = new int[2];
        twoNumberArray[0] = twoNumber.get(0);
        twoNumberArray[1] = twoNumber.get(1);
        return twoNumberArray;
    }
}
