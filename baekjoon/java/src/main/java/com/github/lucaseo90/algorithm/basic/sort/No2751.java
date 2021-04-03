package com.github.lucaseo90.algorithm.basic.sort;

import java.util.Arrays;
import java.util.Scanner;

public class No2751 {

    static int N;
    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb);
    }
}
