package com.github.hsseo0501.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1890 {
    static int N;

    static int[][] map;
    static long[][] visit;
    static Queue<Point> queue = new LinkedList<Point>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        map = new int[N][N];
        visit = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int v = scanner.nextInt();
                map[i][j] = v;
                visit[i][j] = 0;
            }
        }

        bfs(new Point(0, 0));
        System.out.println(visit[N - 1][N - 1]);
    }

    public static void bfs(Point start) {
        queue.add(start);
        visit[start.getX()][start.getY()] = 1;
        while (!queue.isEmpty()) {
            Point v = queue.poll();
            int x = v.getX();
            int y = v.getY();
            int jump = map[x][y];

            if (x == N - 1 && y == N - 1) {
                break;
            }

            if (visit[x][y] != 0) {
                if (x + jump < N) {
                    visit[x + jump][y] += visit[x][y];
                    queue.add(new Point(x + jump, y));
                }
                if (y + jump < N) {
                    visit[x][y + jump] += visit[x][y];
                    queue.add(new Point(x, y + jump));
                }
            }
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
