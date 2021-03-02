package com.github.lucaseo90;

public class No0509 {

    public int fib(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                arr[0] = 0;
            } else if (i == 1) {
                arr[1] = 1;
            } else {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
        }
        return arr[n];
    }

}
