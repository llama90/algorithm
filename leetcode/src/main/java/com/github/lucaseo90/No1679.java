package com.github.lucaseo90;

import java.util.HashMap;

public class No1679 {

    public int maxOperations(int[] nums, int k) {
        int operationCount = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(k - nums[i])) {
                if (!hashMap.containsKey(nums[i])) {
                    hashMap.put(nums[i], 1);
                } else {
                    hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
                }

            } else {
                int count = hashMap.get(k - nums[i]);
                if (count == 1) {
                    hashMap.remove(k - nums[i]);
                } else {
                    hashMap.put(k - nums[i], count - 1);
                }
                operationCount++;
            }
        }

        return operationCount;
    }

}
