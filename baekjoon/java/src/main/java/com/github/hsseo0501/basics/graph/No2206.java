package com.github.hsseo0501.basics.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No2206 {

    /*
    counter example
    3 3
    000
    000
    000
    ans: 5

    4 4
    0101
    0101
    0001
    1110
    ans: 7
     */

    static int ASCII_OFFSET = 48;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static int N, M;
    static int[][] map;

    static int[][] countMap;
    static boolean tryBreakBlock = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        in.nextLine();

        map = new int[N][M];
        countMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = in.nextLine();

            Arrays.fill(countMap[i], -1);
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - ASCII_OFFSET;
            }
        }

        bfs();

        if (countMap[N - 1][M - 1] == -1) {
            System.out.println(-1);
        } else {
            System.out.println(countMap[N - 1][M - 1]);
        }

    }

    static void bfs() {
        Queue<Point> queue = new LinkedList<Point>();
        queue.add(new Point(0, 0));
        countMap[0][0] = 1;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.getX();
            int y = point.getY();

            if (x == N - 1 && y == M - 1) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int dX = x + dx[i];
                int dY = y + dy[i];

                if (dX < 0 || dY < 0 || dX >= N || dY >= M) {
                    continue;
                }

                if (countMap[dX][dY] == -1) {
                    if (!tryBreakBlock && map[dX][dY] == 1 && isCanTraverseAfterBrokenBlock(dX, dY)) {
                        tryBreakBlock = true;
                        countMap[dX][dY] = countMap[x][y] + 1;
                        queue.add(new Point(dX, dY));
                    } else if (map[dX][dY] == 0) {
                        countMap[dX][dY] = countMap[x][y] + 1;
                        queue.add(new Point(dX, dY));
                    }
                }
            }
        }
    }

    static boolean isCanTraverseAfterBrokenBlock(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int dX = x + dx[i];
            int dY = y + dy[i];

            if (dX < 0 || dY < 0 || dX >= N || dY >= M) {
                continue;
            }

            if (map[dX][dY] == 0) {
                return true;
            }
        }
        return false;
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
