package com.github.hsseo0501.algorithm.basic.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No2178 {
    static int N;
    static int M;

    static int[][] map;
    static int[][] visit;
    static Queue<Point> queue = new LinkedList<Point>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        map = new int[N][M];
        visit = new int[N][M];
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                int v = line.charAt(j);
                map[i][j] = v - 48;
                visit[i][j] = 0;
            }
        }
        bfs();
        System.out.println(visit[N-1][M-1]);
    }

    public static void bfs() {
        queue.add(new Point(0, 0));
        visit[0][0] = 1;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.getX();
            int y = point.getY();

            if (x - 1 >= 0) {
                traverse(x - 1, y, visit[x][y]);
            }

            if (x + 1 < N) {
                traverse(x + 1, y, visit[x][y]);
            }

            if (y - 1 >= 0) {
                traverse(x, y - 1, visit[x][y]);
            }

            if (y + 1 < M) {
                traverse(x, y + 1, visit[x][y]);
            }
        }
    }

    public static void traverse(int x, int y, int traverseCount) {
        if (map[x][y] == 1 && visit[x][y] == 0) {
            visit[x][y] = traverseCount + 1;
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
