package com.github.hsseo0501.basics.nNm;

import java.util.Scanner;

public class No15651 {

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

    static void printPermutation(int[] arr, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(arr[i] + " ");
        }
        sb.append("\n");
        ans.append(sb);
    }
}
