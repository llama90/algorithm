package com.github.lucaseo90.medium;

public class No0167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                break;
            }
            if (numbers[left] < (target - numbers[right])) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{left + 1, right + 1};
    }
}
