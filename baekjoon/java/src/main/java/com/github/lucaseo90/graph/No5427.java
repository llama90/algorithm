package com.github.lucaseo90.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No5427 {
    static int T;
    static int N;
    static int M;
    static char[][] map = new char[1002][1002];

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static final char empty = '.';
    static final char block = '#';
    static final char start = '@';
    static final char fireMark = '*';
    static final String NA = "IMPOSSIBLE";

    static Queue<Point> human = new LinkedList<Point>();
    static Queue<Point> fire = new LinkedList<Point>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for (int testCase = 0; testCase < T; testCase++) {
            N = scanner.nextInt();
            M = scanner.nextInt();

            scanner.nextLine();
            map = new char[M][N];
            for (int i = 0; i < M; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < N; j++) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == start) {
                        human.add(new Point(i, j));
                    }

                    if (map[i][j] == '*') {
                        fire.add(new Point(i, j));
                    }
                }
            }
            solve();

            human.clear();
            fire.clear();;
        }
    }

    public static void solve() {
        int step = 0;
        do {
            step++;
            if (human.isEmpty()) {
                System.out.println(NA);
                return;
            }

            spreadFire();
            if (traverseHuman()) {
                System.out.println(step);
                return;
            }
        } while (true);
    }

    public static boolean traverseHuman() {
        int size = human.size();
        for (int i = 0; i < size; i++) {
            Point p = human.poll();
            int x = p.getX();
            int y = p.getY();
            if (x == 0 || y == 0 || x == M - 1 || y == N - 1) {
                return true;
            }

            for (int j = 0; j < 4; j++) {
                int nx = p.getX() + dx[j];
                int ny = p.getY() + dy[j];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (map[nx][ny] == empty) {
                        map[nx][ny] = start;
                        human.add(new Point(nx, ny));
                    }
                }
            }
        }
        return false;
    }

    public static void spreadFire() {
        int size = fire.size();
        for (int i = 0; i < size; i++) {
            Point p = fire.poll();

            for (int j = 0; j < 4; j++) {
                int nx = p.getX() + dx[j];
                int ny = p.getY() + dy[j];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (map[nx][ny] == empty) {
                        map[nx][ny] = fireMark;
                        fire.add(new Point(nx, ny));
                    }
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
