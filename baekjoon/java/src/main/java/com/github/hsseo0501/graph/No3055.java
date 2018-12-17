package com.github.hsseo0501.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No3055 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    static final char waterMark = '*';
    static final char empty = '.';
    static final char stone = 'X';
    static final String NA = "KAKTUS";

    static final char start = 'S';
    static final char goal = 'D';

    static int R;
    static int C;
    static char[][] map;

    static Queue<Point> beaver = new LinkedList<Point>();
    static Queue<Point> water = new LinkedList<Point>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();

        map = new char[R][C];
        scanner.nextLine();
        for (int r = 0; r < R; r++) {
            String line = scanner.nextLine();
            for (int c = 0; c < line.length(); c++) {
                map[r][c] = line.charAt(c);
                if(map[r][c] == waterMark) {
                    water.add(new Point(r, c));
                }

                if(map[r][c] == start) {
                    beaver.add(new Point(r, c));
                }
            }
        }
        solve();
    }

    public static void solve() {
        int step = 0;
        do {
            step++;
            if(beaver.isEmpty()) {
                System.out.println(NA);
                return;
            }

            overflowWater();
            if(traverseBeaver()) {
                System.out.println(step);
                return;
            }
        } while (true);
    }

    public static boolean traverseBeaver() {
        int size = beaver.size();
        for (int i = 0; i < size; i++) {
            Point p = beaver.poll();

            for (int j = 0; j < 4; j++) {
                int nx = dx[j] + p.getX();
                int ny = dy[j] + p.getY();

                if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
                    if (map[nx][ny] == goal) {
                        beaver.add(new Point(nx, ny));
                        return true;
                    }

                    if (map[nx][ny] == empty) {
                        map[nx][ny] = start;
                        beaver.add(new Point(nx, ny));
                    }
                }
            }
        }
        return false;
    }

    public static void overflowWater() {
        int size = water.size();

        for (int i = 0; i < size; i++) {
            Point p = water.poll();

            for (int j = 0; j < 4; j++) {
                int nx = dx[j] + p.getX();
                int ny = dy[j] + p.getY();

                if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
                    if (map[nx][ny] == empty) {
                        map[nx][ny] = waterMark;
                        water.add(new Point(nx, ny));
                    }
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
