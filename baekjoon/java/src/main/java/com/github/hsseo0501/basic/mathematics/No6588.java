package com.github.hsseo0501.basic.mathematics;

import java.util.Scanner;

public class No6588 {

    static final int SIZE = 1000000;
    static boolean[] isNotPrime = new boolean[SIZE + 1];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        initPrimeNumber();
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }

            boolean isGoldbach = false;
            int mid = n >>> 1;
            for (int i = 0, j = n; i <= mid; i++, j--) {
                if(i % 2 == 1 && j % 2 == 1 && !isNotPrime[i] && !isNotPrime[j]) {
                    System.out.println(n + " = " + i + " + " + j);
                    isGoldbach = true;
                    break;
                }
            }
            if(!isGoldbach) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }

    static void initPrimeNumber() {
        for (int i = 2; i * i < SIZE; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j < SIZE; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        isNotPrime[1] = true;
    }

}
