package com.github.hsseo0501.basic.bruteforce;

import java.util.Scanner;

public class No10972 {

    static int N;
    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        if (nextPermutation(arr)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(arr[i] + " ");
            }
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }

    static boolean nextPermutation(int[] array) {
        // Find non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i])
            i--;
        if (i <= 0)
            return false;

        // Find successor to pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1])
            j--;
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // Reverse suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}
