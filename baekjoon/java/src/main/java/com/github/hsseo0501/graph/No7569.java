package com.github.hsseo0501.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No7569 {
    static int N;
    static int M;
    static int H;
    static int[][][] map;
    static int[][][] visited;
    static Queue<Point> queue = new LinkedList<Point>();
    static int maxDay = 0;
    static int maxVisit = 0;
    static int skipped = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();
        H = scanner.nextInt();

        map = new int[H][N][M];
        visited = new int[H][N][M];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    visited[i][j][k] = 0;
                    map[i][j][k] = scanner.nextInt();
                    if (map[i][j][k] == 1) {
                        queue.add(new Point(i, j, k));
                    } else if (map[i][j][k] == -1) {
                        skipped++;
                    }
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

        if (maxVisit < (H * N * M - skipped)) {
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
        int z = point.getZ();
        if (x >= 0 && y >= 0 && z >= 0 && x < H && y < N && z < M) {
            visited[x][y][z] = 1;
            int day = map[x][y][z];
            day++;
            if (x - 1 >= 0) {
                traverse(x - 1, y, z, day);
            }

            if (x + 1 < H) {
                traverse(x + 1, y, z, day);
            }

            if (y - 1 >= 0) {
                traverse(x, y - 1, z, day);
            }

            if (y + 1 < N) {
                traverse(x, y + 1, z, day);
            }

            if (z - 1 >= 0) {
                traverse(x, y, z - 1, day);
            }

            if (z + 1 < M) {
                traverse(x, y, z + 1, day);
            }
        }
    }

    static void traverse(int x, int y, int z, int day) {
        if (visited[x][y][z] != 1) {
            visited[x][y][z] = 1;
            if (map[x][y][z] == 0) {
                map[x][y][z] = day;
                queue.add(new Point(x, y, z));
                if (day > maxDay) {
                    maxDay = day;
                }
            }
        }
    }

    static private class Point {
        int x;
        int y;
        int z;

        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }
    }
}
