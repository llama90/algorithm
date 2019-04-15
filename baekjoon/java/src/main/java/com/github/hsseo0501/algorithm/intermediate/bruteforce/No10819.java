package com.github.hsseo0501.algorithm.intermediate.bruteforce;

import java.util.Scanner;

public class No10819 {

    static int N;
    static int[] arr = new int[8];

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        dfs(N, N);
        System.out.println(max);
    }

    static void dfs(int n, int r) {
        if (r == 0) {
            max = Math.max(max, calcArr());
        }

        for (int i = n - 1; i >= 0; i--) {
            swap(i, n - 1);
            dfs(n - 1, r - 1);
            swap(i, n - 1);
        }

    }

    static int calcArr() {
        int sum = 0;
        for (int i = 1; i <= N - 1; i++) {
            sum += Math.abs(arr[i - 1] - arr[i]);
        }

        return sum;
    }

    static void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
