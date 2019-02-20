package com.github.hsseo0501.basics.bruteforce;

import java.util.Scanner;

public class No10972 {

    static int N;
    static int[] arr;
    static String currPermutation;

    static boolean foundPermutation = false;
    static boolean printingNextPermutation = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        in.nextLine();
        currPermutation = in.nextLine();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        permutation(arr, 0, N, N);

        if(!printingNextPermutation) {
            System.out.println("-1");
        }

    }

    static void permutation(int[] arr, int depth, int n, int k) {
        if (!printingNextPermutation) {
            if (depth == k) {
                printPermutation(arr, k);
                return;
            }

            for (int i = depth; i < n; i++) {
                rotateRight(arr, depth, i);
                permutation(arr, depth + 1, n, k);
                rotateLeft(arr, depth, i);
            }
        }
    }

    static void rotateRight(int[] arr, int start, int end) {
        int last = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }

        arr[start] = last;
    }

    static void rotateLeft(int[] arr, int start, int end) {
        int first = arr[start];
        for (int i = start; i < end; i++) {
            arr[i] = arr[i + 1];
        }

        arr[end] = first;
    }

    static void printPermutation(int[] arr, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(arr[i] + " ");
        }

        if (foundPermutation) {
            System.out.println(sb.toString());
            printingNextPermutation = true;
        }

        if (sb.toString().contains(currPermutation)) {
            foundPermutation = true;
        }

    }

}
