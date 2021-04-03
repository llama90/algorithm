package com.github.lucaseo90.swea;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No16236 {

    static final int sharkMark = 9;
    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {1, -1, 0, 0};

    static int N;
    static int[][] map = new int[20][20];

    static int sharkSize, sharkEat;
    static Point shark;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
                if (map[i][j] == sharkMark) {
                    shark = new Point(i, j, 0);
                    sharkSize = 2;
                    sharkEat = 0;
                    map[i][j] = 0;
                }
            }
        }

        boolean isUpdated = true;
        while (isUpdated) {
            isUpdated = false;

            boolean[][] visited = new boolean[20][20];
            Queue<Point> queue = new LinkedList<Point>();
            visited[shark.getX()][shark.getY()] = true;
            queue.add(shark);

            Point candidate = new Point(20, 0, -1);
            while (!queue.isEmpty()) {
                Point current = queue.poll();
                if (candidate.getCount() != -1 && candidate.getCount() < current.getCount()) {
                    break;
                }

                if (map[current.getX()][current.getY()] < sharkSize && map[current.getX()][current.getY()] != 0) {
                    isUpdated = true;
                    if (candidate.getX() > current.getX() || (candidate.getX() == current.getX() && candidate.getY() > current.getY())) {
                        candidate = current;
                    }
                }

                for (int i = 0; i < 4; i++) {
                    Point next = new Point(current.getX() + dx[i], current.getY() + dy[i], current.getCount() + 1);

                    if (next.getX() < 0 || next.getY() < 0 || next.getX() >= N || next.getY() >= N) {
                        continue;
                    }

                    if (visited[next.getX()][next.getY()] == false && sharkSize >= map[next.getX()][next.getY()]) {
                        visited[next.getX()][next.getY()] = true;
                        queue.add(next);
                    }
                }
            }

            if (isUpdated) {
                shark = candidate;
                ++sharkEat;
                if (sharkEat == sharkSize) {
                    ++sharkSize;
                    sharkEat = 0;
                }
                map[shark.getX()][shark.getY()] = 0;
            }

        }

        System.out.println(shark.getCount());
    }

    static class Point {
        int x, y, count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
