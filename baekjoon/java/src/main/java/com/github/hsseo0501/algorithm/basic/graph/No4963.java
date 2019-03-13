package com.github.hsseo0501.algorithm.basic.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No4963 {
    static int N;
    static int M;
    static int[][] map;
    static int[][] visited;
    static Queue<Point> queue = new LinkedList<Point>();
    static int numGround = 0;
    static int traverseGround = 0;
    static int numIsland = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            numGround = 0;
            traverseGround = 0;
            numIsland = 0;

            N = scanner.nextInt();
            M = scanner.nextInt();

            if (N == 0 && M == 0) {
                break;
            }

            map = new int[M][N];
            visited = new int[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    visited[i][j] = 0;
                    map[i][j] = scanner.nextInt();
                    if (map[i][j] == 1) {
                        numGround++;
                    }
                }
            }
            bfs();
            System.out.println(numIsland);
        }
    }

    public static void bfs() {

        while (traverseGround != numGround) {
            if (queue.isEmpty()) {
                boolean flag = false;
                for (int i = 0; i < M; i++) {
                    if (flag == true) {
                        break;
                    }
                    for (int j = 0; j < N; j++) {
                        if (visited[i][j] == 0 && map[i][j] == 1) {
                            queue.add(new Point(i, j));
                            visited[i][j] = 1;
                            numIsland++;
                            flag = true;
                            break;
                        }
                    }
                }
            }

            while (!queue.isEmpty()) {
                Point point = queue.poll();
                traverseGround++;
                visit(point);
            }
        }
    }

    public static void visit(Point point) {
        int x = point.getX();
        int y = point.getY();
        if (x >= 0 && y >= 0 && x < M && y < N) {
            if (x - 1 >= 0) {
                traverse(x - 1, y);
            }
            if (x + 1 < M) {
                traverse(x + 1, y);
            }
            if (y - 1 >= 0) {
                traverse(x, y - 1);
            }
            if (y + 1 < N) {
                traverse(x, y + 1);
            }
            if (x - 1 >= 0 && y + 1 < N) {
                traverse(x - 1, y + 1);
            }
            if (x - 1 >= 0 && y - 1 >= 0) {
                traverse(x - 1, y - 1);
            }
            if (x + 1 < M && y + 1 < N) {
                traverse(x + 1, y + 1);
            }
            if (x + 1 < M && y - 1 >= 0) {
                traverse(x + 1, y - 1);
            }
        }
    }

    private static void traverse(int x, int y) {
        if (visited[x][y] != 1 && map[x][y] == 1) {
            visited[x][y] = 1;
            queue.add(new Point(x, y));
        }
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
