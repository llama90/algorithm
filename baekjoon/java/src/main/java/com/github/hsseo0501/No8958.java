package com.github.hsseo0501;

import java.util.Scanner;

public class No8958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            int score = 0;
            int totalScore = 0;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'X') {
                    score = 0;
                    continue;
                }

                score++;
                totalScore += score;
            }
            System.out.println(totalScore);
        }
    }
}
