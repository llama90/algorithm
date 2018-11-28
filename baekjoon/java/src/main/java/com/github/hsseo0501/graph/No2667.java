package com.github.hsseo0501.graph;

import java.util.*;

public class No2667 {
    static int N;
    static int[][] map;
    static int[][] visit;
    static Queue<Point> queue = new LinkedList<Point>();
    static int numCities = 0;
    static int totalHouse = 0;
    static int countHouse = 0;
    static int numHouse = 0;
    static int[] numHouses = new int[625];
    static int numHousesIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        map = new int[N][N];
        visit = new int[N][N];
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                char v = line.charAt(j);
                map[i][j] = (short) (v - 48);
                visit[i][j] = 0;
                if (map[i][j] == 1) {
                    totalHouse++;
                }
            }
        }

        for (int i = 0; i < 625; i++) {
            numHouses[i] = Integer.MAX_VALUE;
        }

        bfs();

        System.out.println(numCities);
        Arrays.sort(numHouses);
        for (int i = 0; i < numHousesIndex; i++) {
            System.out.println(numHouses[i]);
        }
    }

    public static void bfs() {
        while (totalHouse != countHouse) {
            if (queue.isEmpty()) {
                Point point = findNonVisitHose();
                if (point != null) {
                    queue.add(point);
                }
            }

            while (!queue.isEmpty()) {
                Point v = queue.poll();
                int x = v.getX();
                int y = v.getY();
                if (x + 1 < N) {
                    traverse(x + 1, y);
                }

                if (x - 1 >= 0) {
                    traverse(x - 1, y);
                }

                if (y + 1 < N) {
                    traverse(x, y + 1);
                }

                if (y - 1 >= 0) {
                    traverse(x, y - 1);
                }
            }
            numHouses[numHousesIndex++] = numHouse;
            numHouse = 0;
        }
    }

    public static Point findNonVisitHose() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && visit[i][j] == 0) {
                    visit[i][j] = 1;
                    numHouse++;
                    countHouse++;
                    numCities++;
                    return new Point(i, j);
                }
            }
        }
        return null;
    }

    public static void traverse(int x, int y) {
        if (map[x][y] == 1 && visit[x][y] == 0) {
            visit[x][y] = 1;
            queue.add(new Point(x, y));
            numHouse++;
            countHouse++;
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
