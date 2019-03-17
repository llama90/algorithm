package com.github.hsseo0501.algorithm.basic.dp;

import java.util.Scanner;

public class No11052 {

    static int N;
    static int[] price;
    static int[] maxPrice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        price = new int[N + 1];
        maxPrice = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            price[i] = scanner.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                maxPrice[i] = Math.max(maxPrice[i], price[j] + maxPrice[i - j]);
            }
        }

        System.out.println(maxPrice[N]);
    }

}
