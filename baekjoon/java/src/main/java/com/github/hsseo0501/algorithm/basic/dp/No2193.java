package com.github.hsseo0501.algorithm.basic.dp;

import java.util.Scanner;

public class No2193 {

    static int N;
    static long[] dp = new long[91];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < N; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        System.out.println(dp[N - 1]);

    }

}
