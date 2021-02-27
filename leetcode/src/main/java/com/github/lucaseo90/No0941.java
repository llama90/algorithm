package com.github.lucaseo90;

public class No0941 {
    public static boolean validMountainArray(int[] arr) {
        boolean isMountain = true;

        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (!isIncreasing && arr[i] < arr[i + 1]) {
                isIncreasing = true;
            } else if(!isIncreasing && arr[i] >= arr[i + 1]){
                isMountain = false;
                break;
            }

            if (isIncreasing && !isDecreasing) {
                if (arr[i] > arr[i + 1]) {
                    isDecreasing = true;
                } else if (arr[i] == arr[i + 1]) {
                    isMountain = false;
                    break;
                }
            }

            if (isIncreasing && isDecreasing) {
                if (arr[i] <= arr[i + 1]) {
                    isMountain = false;
                    break;
                }
            }
        }

        if(!isIncreasing || !isDecreasing) {
            isMountain = false;
        }

        return isMountain;
    }
}
