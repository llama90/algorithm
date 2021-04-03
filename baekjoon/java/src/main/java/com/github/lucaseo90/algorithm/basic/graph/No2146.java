package com.github.lucaseo90.algorithm.basic.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No2146 {

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static int N;
    static int[][] map;
    static Queue<Point> queue = new LinkedList();
    static int number = 0;
    static int[][] cntMap;
    static int minCost = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new int[N][N];
        cntMap = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int value = scanner.nextInt();
                if (value == 1) {
                    map[i][j] = -1;
                } else {
                    map[i][j] = value;
                }
            }
        }

        executeNumbering();
        traverse();
        System.out.println(minCost);
    }

    static void initQueue() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0) {
                    queue.add(new Point(i, j));
                }
            }
        }
    }

    static void traverse() {
        initQueue();

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int x = p.getX();
            int y = p.getY();

            for (int i = 0; i < 4; i++) {
                int dX = x + dx[i];
                int dY = y + dy[i];

                if (dX >= N || dY >= N || dX < 0 || dY < 0) {
                    continue;
                }

                if (map[dX][dY] == 0) {
                    map[dX][dY] = map[x][y];
                    cntMap[dX][dY] = cntMap[x][y] + 1;
                    queue.add(new Point(dX, dY));
                } else if (map[dX][dY] != map[x][y]) {
                    int cost = cntMap[dX][dY] + cntMap[x][y];
                    if(minCost > cost) {
                        minCost = cost;
                    }
                }
            }
        }
    }

    static void executeNumbering() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) {
                    continue;
                }

                if (map[i][j] == -1) {
                    numberingBfs(new Point(i, j));
                }
            }
        }
    }

    static void numberingBfs(Point point) {
        Queue<Point> queue = new LinkedList<Point>();
        queue.add(point);
        number++;
        map[point.getX()][point.getY()] = number;
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int x = p.getX();
            int y = p.getY();

            for (int i = 0; i < 4; i++) {
                int dX = x + dx[i];
                int dY = y + dy[i];

                if (dX >= N || dY >= N || dX < 0 || dY < 0) {
                    continue;
                }

                if (map[dX][dY] == -1) {
                    map[dX][dY] = number;
                    queue.add(new Point(dX, dY));
                }
            }
        }

        queue.clear();
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
