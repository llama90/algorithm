package com.github.hsseo0501.basic.bruteforce;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class No2309 {

    static final int SIZE = 9;
    static int[] perm = new int[SIZE];
    static int[] height = new int[SIZE];
    static LinkedList<Integer> heightList = new LinkedList<Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            height[i] = in.nextInt();
        }

        permutation(SIZE, 7, 7);
    }

    static void swap(int i, int j) {
        int temp = height[i];
        height[i] = height[j];
        height[j] = temp;
    }

    static int process(int q) {
        int sum = 0;
        for (int i = q - 1; i >= 0; i--) {
            sum += height[i];
        }
        return sum;
    }

    static void permutation(int n, int r, int q) {
        if (heightList.isEmpty()) {
            if (r == 0) {
                int sum = process(q);

                if (sum == 100) {
                    buildHeightList(q);
                }
                return;
            }

            for (int i = n - 1; i >= 0; i--) {
                swap(i, n - 1);
                perm[r - 1] = height[n - 1];
                permutation(n - 1, r - 1, q);
                swap(i, n - 1);
            }
        }
    }

    static void buildHeightList(int q) {
        for (int i = 0; i < q; i++) {
            heightList.add(height[i]);
        }

        Collections.sort(heightList);
        for (int i = 0; i < heightList.size(); i++) {
            System.out.println(heightList.get(i));
        }
    }
}
