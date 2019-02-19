package com.github.hsseo0501;

import java.util.Scanner;

public class No2675 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {
            int N = in.nextInt();

            String line = in.nextLine();
            for (int i = 1; i < line.length(); i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(line.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
