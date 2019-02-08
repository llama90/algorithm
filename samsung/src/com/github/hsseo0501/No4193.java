package com.github.hsseo0501;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No4193 {

    static int testCase;
    static int t;

    static int N;
    static int[][] map;
    static int[][] visitCnt;
    static Queue<Point> queue = new LinkedList<>();

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testCase = in.nextInt();
        for (t = 1; t <= testCase; t++) {
            N = in.nextInt();
            map = new int[N][N];
            visitCnt = new int[N][N];

            for (int i = 0; i < N; i++) {
                Arrays.fill(visitCnt[i], Integer.MAX_VALUE);
                for (int j = 0; j < N; j++) {
                    map[i][j] = in.nextInt();
                }
            }

            Point start = new Point(in.nextInt(), in.nextInt());
            Point end = new Point(in.nextInt(), in.nextInt());

            traverse(start, end);
        }
    }

    private static void traverse(Point start, Point end) {
        queue.add(start);
        visitCnt[start.getX()][start.getY()] = 0;

        int endPointX = end.getX();
        int endPointY = end.getY();
        boolean traversed = false;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.getX();
            int y = point.getY();

            if (x == endPointX && y == endPointY) {
                traversed = true;
            }

            for (int i = 0; i < 4; i++) {
                int dX = dx[i] + x;
                int dY = dy[i] + y;

                if (dX >= 0 && dY >= 0 && dX < N && dY < N) {
                    checkPoint(dX, dY, visitCnt[x][y]);
                }
            }
        }

        if (traversed) {
            System.out.println("#" + t + " " + visitCnt[endPointX][endPointY]);
        } else {
            System.out.println("#" + t + " -1");
        }

        queue.clear();
    }

    private static void checkPoint(int x, int y, int prevVisitCnt) {
        if (map[x][y] != 1) {
            if (map[x][y] == 0) {
                if (visitCnt[x][y] > prevVisitCnt + 1) {
                    visitCnt[x][y] = prevVisitCnt + 1;
                    queue.add(new Point(x, y));
                }
            } else if (map[x][y] == 2) {
                if (prevVisitCnt % 3 == 0) {
                    enqueueWhenMeetVortex(3, x, y, prevVisitCnt);
                } else if (prevVisitCnt % 3 == 1) {
                    enqueueWhenMeetVortex(2, x, y, prevVisitCnt);
                } else if (prevVisitCnt % 3 == 2) {
                    enqueueWhenMeetVortex(1, x, y, prevVisitCnt);
                }
            }
        }
    }

    private static void enqueueWhenMeetVortex(int n, int x, int y, int prevVisitCnt) {
        if (visitCnt[x][y] > prevVisitCnt + n) {
            visitCnt[x][y] = prevVisitCnt + n;
            queue.add(new Point(x, y));
        }
    }


    private static class Point {
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
