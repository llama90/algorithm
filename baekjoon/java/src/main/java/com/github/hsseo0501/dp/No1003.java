package com.github.hsseo0501.dp;

import java.util.Arrays;
import java.util.Scanner;

public class No1003 {
    static int testCase = 0;

    static int[] memo;
    static int zeroCount = 0;
    static int oneCount = 0;

    static final int initValue = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            initialize();
            fibonacci(scanner.nextInt());
            System.out.println(zeroCount + " " + oneCount);
        }
        memo[0] = 0;
        memo[1] = 1;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            zeroCount++;
            return memo[n];
        } else if (n == 1) {
            oneCount++;
            return memo[n];
        }

        if (memo[n] != initValue) {
            return memo[n];
        }

        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }

    public static void initialize() {
        memo = new int[41];
        Arrays.fill(memo, initValue);
        zeroCount = 0;
        oneCount = 0;
    }
}
