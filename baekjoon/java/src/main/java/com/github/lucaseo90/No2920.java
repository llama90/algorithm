package com.github.lucaseo90;

import java.util.Scanner;

public class No2920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 8;
        int firstNumber = in.nextInt();
        if (firstNumber == 1) {
            boolean isAscending = true;
            for (int i = 2; i <= N; i++) {
                int n = in.nextInt();
                if (n != i) {
                    isAscending = false;
                    break;
                }
            }

            if (isAscending) {
                System.out.println("ascending");
            } else {
                System.out.println("mixed");
            }

        } else if (firstNumber == 8) {
            boolean isDescending = true;
            for (int i = 7; i >= 1; i--) {
                int n = in.nextInt();
                if (n != i) {
                    isDescending = false;
                    break;
                }
            }

            if (isDescending) {
                System.out.println("descending");
            } else {
                System.out.println("mixed");
            }

        } else {
            System.out.println("mixed");
        }
    }
}
