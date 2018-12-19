package com.github.hsseo0501.graph;

import java.util.Scanner;

public class No11404 {
    static int N;
    static int M;

    static int[][] costMap;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        costMap = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                costMap[i][j] = (i == j) ? 0 : 100001;
            }
        }

        for (int i = 1; i <= M; i++) {
            int s = scanner.nextInt();
            int d = scanner.nextInt();
            int c = scanner.nextInt();
            costMap[s][d] = Math.min(costMap[s][d], c);
        }

        traverse();
        printCost();
    }

    public static void traverse() {
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (costMap[i][j] > costMap[i][k] + costMap[k][j]) {
                        costMap[i][j] = costMap[i][k] + costMap[k][j];
                    }
                }
            }
        }
    }

    public static void printCost() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (costMap[i][j] == 100001) {
                    System.out.print("0 ");
                } else {
                    System.out.print(costMap[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
