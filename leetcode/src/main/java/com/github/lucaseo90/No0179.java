package com.github.lucaseo90;

import java.math.BigInteger;
import java.util.ArrayList;

public class No0179 {
    private static ArrayList<Integer> elements = new ArrayList<>();
    private static String largestNumber = "0";

    public static String largestNumber(int[] nums) {
        int size = nums.length;
        boolean[] picked = new boolean[size];
        largestNumber = "0";
        findLargestNumber(nums, picked, size, 0);
        return largestNumber;
    }

    public static void findLargestNumber(int[] nums, boolean[] picked, int size, int depth) {
        if (elements.size() == size) {
            StringBuilder number = new StringBuilder();
            for (int i = 0; i < elements.size(); i++) {
                number.append(elements.get(i));
            }
            BigInteger largest = new BigInteger(largestNumber);
            BigInteger compare = new BigInteger(number.toString());
            if (largest.compareTo(compare) < 0) {
                largestNumber = number.toString();
            }

            return;
        }

        for (int i = depth; i < size; i++) {
            if (!picked[i]) {
                picked[i] = true;
                elements.add(nums[i]);
                findLargestNumber(nums, picked, size, depth);
                elements.remove(elements.size() - 1);
                picked[i] = false;
            }
        }
    }
}
