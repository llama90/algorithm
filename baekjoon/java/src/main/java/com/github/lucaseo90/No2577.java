package com.github.lucaseo90;

import java.util.Scanner;

public class No2577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int mul = A * B * C;

        int[] count = new int[10];
        String str = String.valueOf(mul);
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 48]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
