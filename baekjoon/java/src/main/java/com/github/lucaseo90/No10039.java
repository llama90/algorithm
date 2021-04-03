package com.github.lucaseo90;

import java.util.Scanner;

public class No10039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int score = in.nextInt();
            sum += score < 40 ? 40 : score;
        }
        System.out.println(sum / 5);
    }
}
