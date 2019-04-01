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

        System.out.println(bfs());
    }

    static int bfs() {

        while (!redQueue.isEmpty()) {
            Point r = redQueue.poll();
            Point b = blueQueue.poll();

            if (r.count >= 10) {
                return -1;
            }

            if (map[r.x][r.y] == hole) {
                if (b != null) {
                    if (r.dx == b.dx && r.dy == b.dy) {
                        return -1;
                    } else {
                        return r.count;
                    }
                } else {
                    return r.count;
                }
            }

            if (r != null) {
                traverse(r, redQueue, blue);
            }

            if (b != null) {
                traverse(b, blueQueue, red);
            }
        }

        return -1;
    }

    static void traverse(Point p, Queue<Point> queue, char other) {
        int x = p.x;
        int y = p.y;
        int count = p.count;

        for (int i = 0; i < 4; i++) {

            if (dx[i] == p.dx && dy[i] == p.dy) {
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
                    queue.add(new Point(dX, dY, count + 1, -dx[i], -dy[i]));
                    change(x, y);
                    break;
                }

                if (map[dX][dY] == block || map[dX][dY] == other) {
                    dX += -dx[i];
                    dY += -dy[i];

                    if (p.x == dX && p.y == dY) {
                        break;
                    }

                    queue.add(new Point(dX, dY, count + 1, -dx[i], -dy[i]));
                    change(x, y, dX, dY);
                    break;
                }
            }
        }
    }

    static void change(int x, int y, int dX, int dY) {
        char temp = map[x][y];
        map[x][y] = map[dX][dY];
        map[dX][dY] = temp;
    }

    static void change(int x, int y) {
        map[x][y] = '.';
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
