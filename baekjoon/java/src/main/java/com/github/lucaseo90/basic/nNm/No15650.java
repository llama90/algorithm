package com.github.lucaseo90.basic.nNm;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class No15650 {

    static int N;
    static int M;
    static int[] arr;
    static HashSet<String> set = new HashSet<String>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        permutation(arr, 0, N, M);
    }

    static void permutation(int[] arr, int depth, int n, int k) {
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
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            sb.append(queue.poll() + " ");
        }

        if(!set.contains(sb.toString())) {
            System.out.println(sb.toString());
            set.add(sb.toString());
        }
    }
}
