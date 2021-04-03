package com.github.lucaseo90.algorithm.basic.dp;

import java.util.Scanner;

public class No11726 {

    static int N;
    static int[] tile = new int[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        tile[0] = 1;
        tile[1] = 2;

        for (int i = 2; i < N; i++) {
            tile[i] = (tile[i - 1] + tile[i - 2]) % 10007;
        }

        System.out.println(tile[N - 1]);
    }
}
