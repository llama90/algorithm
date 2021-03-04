package com.github.lucaseo90.interview.array;

import java.util.Arrays;

public class No0136_SingleNumber {

    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                singleNumber += nums[i];
            } else {
                singleNumber -= nums[i];
            }
        }
        return singleNumber;
    }

}
