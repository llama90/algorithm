package com.github.hsseo0501.swea;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No13460 {

    static final char hole = 'O';
    static final char block = '#';
    static final char red = 'R';
    static final char blue = 'B';

    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {-1, 1, 0, 0};

    static Queue<Point> redQueue = new LinkedList<Point>();
    static Queue<Point> blueQueue = new LinkedList<Point>();
    static int redCount = 0;
    static int blueCount = 0;

    static int N, M;
    static char[][] map;
    static boolean[][] redVisited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();
        map = new char[N][M];
        redVisited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < line.length(); j++) {
                map[i][j] = line.charAt(j);

                if (map[i][j] == red) {
                    redQueue.add(new Point(i, j, 0, 0, 0));
                }

                if (map[i][j] == blue) {
                    blueQueue.add(new Point(i, j, 0, 0, 0));
                }

            }
        }

        bfs();
    }

    static void bfs() {

        while (!redQueue.isEmpty()) {
            Point r = redQueue.poll();
            int x = r.x;
            int y = r.y;
            int count = r.count;


            System.out.println(x + "," + y + " : " + count + " " + r.dx + "," + r.dy);
            if (r.count >= 10) {
                System.out.println(-1);
                break;
            }

            if (map[x][y] == hole) {
                redCount = count;
                System.out.println(redCount);
                return;
            }

            for (int i = 0; i < 4; i++) {

                if (dx[i] == r.dx && dy[i] == r.dy) {
                    continue;
                }

                int dX = x;
                int dY = y;
                while (true) {
                    dX += dx[i];
                    dY += dy[i];

                    if (dX < 0 || dY < 0 || dX >= N || dY >= M) {
                        break;
                    }

                    if (map[dX][dY] == hole) {
                        redQueue.add(new Point(dX, dY, count + 1, -dx[i], -dy[i]));
                        break;
                    }

                    if (map[dX][dY] == block || map[dX][dY] == blue) {
                        dX += -dx[i];
                        dY += -dy[i];

                        if (r.x == dX && r.y == dY) {
                            break;
                        }

                        System.out.println("add: " + dX + "," + dY + " : " + (count + 1) + " " + -r.dx + "," + -r.dy);
                        redQueue.add(new Point(dX, dY, count + 1, -dx[i], -dy[i]));
                        break;
                    }
                }
            }
        }
    }

    static class Point {
        int x, y;
        int count;
        int dx, dy;

        public Point(int x, int y, int count, int dx, int dy) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.dx = dx;
            this.dy = dy;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}
