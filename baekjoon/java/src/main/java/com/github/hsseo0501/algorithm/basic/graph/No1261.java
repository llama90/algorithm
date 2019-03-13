package com.github.hsseo0501.algorithm.basic.graph;

import java.util.Arrays;
import java.util.Scanner;

public class No1261 {

    static int ASCII_OFFSET = 48;

    static int N, M;
    static int[][] map;

    static int[][] costMap;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        in.nextLine();

        map = new int[N][M];
        costMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = in.nextLine();

            Arrays.fill(costMap[i], -1);
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - ASCII_OFFSET;
            }
        }

        System.out.println();
    }

    static void dijkstra() {

    }
}
