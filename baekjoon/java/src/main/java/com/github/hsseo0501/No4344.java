package com.github.hsseo0501;

import java.util.Scanner;

public class No4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        for (int i = 0; i < C; i++) {
            int numStudents = in.nextInt();
            int numHighScoreStudents = 0;
            int[] scores = new int[numStudents];
            int avg = 0;
            for (int j = 0; j < numStudents; j++) {
                scores[j] = in.nextInt();
                avg += scores[j];
            }

            avg = avg / numStudents;

            for (int j = 0; j < numStudents; j++) {
                if (scores[j] > avg) {
                    numHighScoreStudents++;
                }
            }

            System.out.format("%.3f%%%n", (numHighScoreStudents / (double) numStudents) * 100);
        }
    }
}
