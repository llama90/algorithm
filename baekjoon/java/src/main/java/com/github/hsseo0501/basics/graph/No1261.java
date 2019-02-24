package com.github.hsseo0501.basics.graph;

import java.util.Scanner;

public class No1261 {

    static int ASCII_OFFSET = 48;

    static int N, M;
    static int[][] map;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        in.nextLine();

        map = new int[N][M];

        for(int i = 0;i < N; i++){
            String line = in.nextLine();
            for(int j = 0;j < M;j++){
                map[i][j] = line.charAt(j) - ASCII_OFFSET;
            }
        }

        System.out.println();
    }
}
