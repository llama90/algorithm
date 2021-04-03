package com.github.lucaseo90;

import java.util.Scanner;

public class No11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String numbers = in.nextLine();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (numbers.charAt(i) - 48);
        }
        System.out.println(sum);
    }
}
