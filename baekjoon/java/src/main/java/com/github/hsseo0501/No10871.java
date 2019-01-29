package com.github.hsseo0501;

import java.util.Scanner;

public class No10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();

        for (int i = 0; i < N; i++) {
            int element = in.nextInt();
            if (element < X) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}
