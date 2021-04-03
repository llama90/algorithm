package com.github.lucaseo90.graph;

import java.util.Scanner;

public class No1890 {
    static int N;

    static int[][] map;
    static long[][] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        map = new int[N][N];
        memo = new long[N][N];

        memo[0][0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int v = scanner.nextInt();
                map[i][j] = v;
            }
        }

        solve();
        System.out.println(memo[N - 1][N - 1]);
    }

    public static void solve() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (memo[i][j] == 0 || (i == N - 1 && j == N - 1)) {
                    continue;
                }

                int distance = map[i][j];
                int down = i + distance;
                int right = j + distance;

                if (down < N) {
                    memo[down][j] += memo[i][j];
                }

                if (right < N) {
                    memo[i][right] += memo[i][j];
                }
            }
        }
    }
}
