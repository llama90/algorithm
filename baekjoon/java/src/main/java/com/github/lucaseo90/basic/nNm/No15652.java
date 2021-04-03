package com.github.lucaseo90.basic.nNm;

import java.util.Scanner;

public class No15652 {

    static int N;
    static int M;
    static int[] arr;
    static StringBuilder ans = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

//        long start = System.currentTimeMillis();
        permutation(arr, 0, N, M);
        System.out.println(ans.toString());
//        System.out.println(System.currentTimeMillis() - start);
    }

    static void permutation(int[] arr, int depth, int n, int k) {
        if (depth == k) {
            printPermutation(arr, k);
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i + 1;
            permutation(arr, depth + 1, n, k);
        }
    }

    static boolean isAscending(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static void printPermutation(int[] arr, int k) {
        if (isAscending(arr, k)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            ans.append(sb);
        }
    }
}
