package com.github.lucaseo90.algorithm.basic.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No7576 {
    static int N;
    static int M;
    static int[][] map;
    static int[][] visited;
    static Queue<Point> queue = new LinkedList<Point>();
    static int maxDay = 0;
    static int maxVisit = 0;
    static int skipped = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();

        map = new int[N][M];
        visited = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = 0;
                map[i][j] = scanner.nextInt();
                if (map[i][j] == 1) {
                    queue.add(new Point(i, j));
                } else if (map[i][j] == -1) {
                    skipped++;
                }
            }
        }
        bfs();
    }

    public static void bfs() {

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            maxVisit++;
            visit(point);
        }

        if (maxVisit < (N * M - skipped)) {
            System.out.println("-1");
        } else {
            if (maxDay != 0) {
                maxDay = maxDay - 1;
            }
            System.out.println(maxDay);
        }
    }

    public static void visit(Point point) {
        int x = point.getX();
        int y = point.getY();
        if (x >= 0 && y >= 0 && x < N && y < M) {
            visited[x][y] = 1;
            int day = map[x][y];
            day++;
            // 위
            if (x - 1 >= 0) {
                traverse(x - 1, y, day);
            }
            // 아래
            if (x + 1 < N) {
                traverse(x + 1, y, day);
            }

            // 좌
            if (y - 1 >= 0) {
                traverse(x, y - 1, day);
            }

            // 우
            if (y + 1 < M) {
                traverse(x, y + 1, day);
            }
        }
    }

    private static void traverse(int x, int y, int day) {
        if (visited[x][y] != 1) {
            visited[x][y] = 1;
            if (map[x][y] == 0) {
                map[x][y] = day;
                queue.add(new Point(x, y));
                if (day > maxDay) {
                    maxDay = day;
                }
            }
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
