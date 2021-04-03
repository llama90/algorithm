package com.github.lucaseo90.algorithm.basic.dp;

import java.util.Scanner;

public class No10844 {

    static int N;
    static int[][] dp = new int[1001][10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            dp[0][i] = i + 1;
        }

        for (int i = 0; i < 1001; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < 10; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 10007;
            }
        }

        System.out.println(dp[N - 1][9] % 10007);

    }

}
