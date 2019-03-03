package com.github.hsseo0501.basic.mathematics;

import java.util.Scanner;

public class No1978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int element = in.nextInt();
            if(element == 1) {
                count--;
            }
            if (isPrime(element)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
