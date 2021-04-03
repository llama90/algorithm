package com.github.lucaseo90.algorithm.intermediate.bruteforce;

import java.util.Scanner;

public class No1987 {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int ASCII_OFFSET = 65;

    static int R, C;
    static char[][] map;
    static boolean[] visited = new boolean[26];
    static int countStep = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();
        scanner.nextLine();

        map = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < line.length(); j++) {
                map[i][j] = line.charAt(j);
            }
        }

        dfs(new Point(0, 0), 1);
        System.out.println(countStep);
    }

    static void dfs(Point p, int step) {
        int x = p.getX();
        int y = p.getY();
        visited[map[x][y] - ASCII_OFFSET] = true;

        for (int i = 0; i < 4; i++) {
            int dX = x + dx[i];
            int dY = y + dy[i];

            if (dX >= R || dY >= C || dX < 0 || dY < 0) {
                continue;
            }

            if (visited[map[dX][dY] - ASCII_OFFSET]) {
                continue;
            }

            dfs(new Point(dX, dY), step + 1);
            visited[map[dX][dY] - ASCII_OFFSET] = false;
        }

        countStep = Math.max(countStep, step);
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}
