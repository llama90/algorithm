package com.github.lucaseo90;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class No0414 {

    public static int thirdMax(int[] nums) {
        int meaningfulComparisonCount = 0;

        // Java 8
        Integer[] arr = IntStream.of(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        int thirdIndex = 0;
        if (arr.length < 3) {
            thirdIndex = 0;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (!arr[i + 1].equals(arr[i])) {
                    meaningfulComparisonCount++;
                    if (meaningfulComparisonCount == 2) {
                        thirdIndex = i + 1;
                        break;
                    }
                }
            }
        }
        return arr[thirdIndex];
    }

}
