package com.github.hsseo0501.problem.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No16137 {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    static int N;
    static int M;
    static int[][] map;

    static int[][] visitCnt;
    static Queue<Point> queue = new LinkedList<Point>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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
    }

    private static void bfs() {
        visitCnt[0][0] = 0;
        queue.add(new Point(0, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int q = 0; q < size; q++) {
                Point point = queue.poll();
                int x = point.getX();
                int y = point.getY();

                if (x == N - 1 && y == N - 1) {
                    System.out.println(visitCnt[N - 1][N - 1]);
                }

                for (int i = 0; i < 4; i++) {
                    int dX = x + dx[i];
                    int dY = y + dy[i];

                    if (dX >= N || dY >= N || dX < 0 || dY < 0) {
                        continue;
                    }

                    if (visitCnt[dX][dY] == Integer.MAX_VALUE) {
                        traverse(dX, dY, x, y, visitCnt[x][y]);
                    }
                }
            }
            printVisitCnt();
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

    private static void traverse(int x, int y, int prevX, int prevY, int prevCnt) {
        int point = map[x][y];
        if (point == 1) {
            visitCnt[x][y] = point + prevCnt;
            queue.add(new Point(x, y));
        } else if (point == 0) {
            if (getNumBlockedPoint(x, y) < 2) {
                if (prevCnt <= M) {
                    visitCnt[x][y] = M;
                } else {
                    visitCnt[x][y] = M + 1;
                }
                queue.add(new Point(x, y));
            }
        } else if (point > 1 && map[prevX][prevY] <= 1) {
            if (prevCnt % point == 0) {
                visitCnt[x][y] = prevCnt + 1;
                queue.add(new Point(x, y));
            } else {
                visitCnt[x][y] = point;
                queue.add(new Point(x, y));
            }
        }
    }

    private static int getNumBlockedPoint(int x, int y) {
        int blockCount = 0;
        for (int i = 0; i < 4; i++) {
            int dX = x + dx[i];
            int dY = y + dy[i];

            if (dX >= N || dY >= N || dX < 0 || dY < 0) {
                continue;
            }

            if (map[dX][dY] == 0) {
                blockCount++;
            }
        }

        return blockCount;
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
