package com.github.hsseo0501;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No4727 {

    static int[] dx = {0, 1};
    static int[] dy = {1, 0};

    static int testCase;
    static int t;

    static int N;
    static int M;
    static int[][] map;

    static int[][] visitCnt;
    static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testCase = in.nextInt();

        for (t = 1; t <= testCase; t++) {
            N = in.nextInt();
            M = in.nextInt();
            map = new int[N][N];

            visitCnt = new int[N][N];

            for (int i = 0; i < N; i++) {
                Arrays.fill(visitCnt[i], Integer.MAX_VALUE);
                for (int j = 0; j < N; j++) {
                    map[i][j] = in.nextInt();
                }
            }

            bfs();

            System.out.println("#" + t + " " + visitCnt[N - 1][N - 1]);
        }
    }

    private static void bfs() {
        visitCnt[0][0] = 0;
        queue.add(new Point(0, 0));

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.getX();
            int y = point.getY();
//            printVisitCnt();

            for (int i = 0; i < 2; i++) {
                int dX = x + dx[i];
                int dY = y + dy[i];
                if (dX < N && dY < N) {
                    traverse(dX, dY, visitCnt[x][y]);
                }
            }

        }

        queue.clear();
    }

    private static void printVisitCnt() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visitCnt[i][j] == Integer.MAX_VALUE) {
                    System.out.print("-1 ");
                } else {
                    System.out.print(visitCnt[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void traverse(int x, int y, int prevCnt) {
        if (map[x][y] == 1) {
            if (visitCnt[x][y] == Integer.MAX_VALUE) {
                visitCnt[x][y] = map[x][y] + prevCnt;
                queue.add(new Point(x, y));
            } else if (visitCnt[x][y] > map[x][y] + prevCnt) {
                visitCnt[x][y] = map[x][y] + prevCnt;
                queue.add(new Point(x, y));
            }
        } else if (map[x][y] == 0) {
            if (!isCross(x, y)) {
                if (prevCnt <= M) {
                    visitCnt[x][y] = M;
                } else {
                    visitCnt[x][y] = prevCnt + 1;
                }
                queue.add(new Point(x, y));
            }
        } else if (map[x][y] > 1) {
            if (prevCnt <= map[x][y]) {
                visitCnt[x][y] = map[x][y];
            } else {
                visitCnt[x][y] = prevCnt + 1;
            }
            queue.add(new Point(x, y));
        }
    }

    private static boolean isCross(int x, int y) {
        if (x - 1 >= 0 && y - 1 >= 0) {
            if (map[x - 1][y] == 0 && map[x][y - 1] == 0) {
                return true;
            }
        }
        if (x + 1 < N && y + 1 < N) {
            if (map[x + 1][y] == 0 && map[x][y + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    private static class Point {
        int x;
        int y;

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
