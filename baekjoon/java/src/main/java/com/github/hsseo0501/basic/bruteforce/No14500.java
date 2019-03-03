package com.github.hsseo0501.basic.bruteforce;

import java.util.Scanner;

public class No14500 {

    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visited;

    static int maxValue = 0;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < N * M; i++) {
            int x = i / M;
            int y = i % M;
            visited[x][y] = true;
            dfs(x, y, 1, map[x][y]);
            traverseSpecificBlock(x, y);
            visited[x][y] = false;
        }

        System.out.println(maxValue);

    }

    static void dfs(int x, int y, int count, int sum) {
        if (count == 4) {
            maxValue = Math.max(maxValue, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int dX = x + dx[i];
            int dY = y + dy[i];

            if (dX >= 0 && dY >= 0 && dX < N && dY < M) {
                if (!visited[dX][dY]) {
                    visited[dX][dY] = true;
                    dfs(dX, dY, count + 1, sum + map[dX][dY]);
                    visited[dX][dY] = false;
                }
            }
        }
    }

    static void traverseSpecificBlock(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int total = map[x][y];
            boolean flag = true;

            for (int j = 0; j < 3; j++) {
                int dX = x + dx[(i + j) % 4];
                int dY = y + dy[(i + j) % 4];

                if (dX >= 0 && dY >= 0 && dX < N && dY < M) {
                    total += map[dX][dY];
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                maxValue = Math.max(maxValue, total);
            }

        }
    }
}
