package com.github.lucaseo90;

import java.util.Scanner;

public class No2441 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
