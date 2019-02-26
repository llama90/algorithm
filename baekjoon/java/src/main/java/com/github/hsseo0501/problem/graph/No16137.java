package com.github.hsseo0501.problem.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No16137 {

    /*
counter example
3 3
1 1 1
1 1 1
1 1 1
ans: 4

5 5
1 2 1 2 1
1 2 1 2 1
1 2 1 2 1
1 2 1 2 1
1 2 1 2 1
ans: 8

4 3
1 1 100 100
1 1 100 100
0 0 1 1
1 0 1 1
ans: 103
(* 데이터 입력 범위를 벗어남)

4 3
1 1 20 20
1 1 20 20
0 0 1 1
1 0 1 1
ans: 23

5 10
1 1 2 3 1
1 1 0 0 1
13 0 0 0 1
1 1 1 1 1
1 1 1 1 1
ans: 15
     */

    static int[] dx = {0, 1};
    static int[] dy = {1, 0};

    static int N;
    static int M;
    static int[][] map;

    static int[][] visitCnt;
    static Queue<Point> queue = new LinkedList<Point>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        map = new int[N][N];

        visitCnt = new int[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(visitCnt[i], Integer.MAX_VALUE);
            for (int j = 0; j < N; j++) {
                map[i][j] = in.nextInt();
            }
        }

        bfs();
    }

    private static void bfs() {
        visitCnt[0][0] = 0;
        queue.add(new Point(0, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int q = 0; q < size; q++) {
                Point point = queue.poll();
                int x = point.getX();
                int y = point.getY();

                if (x == N - 1 && y == N - 1) {
                    System.out.println(visitCnt[N - 1][N - 1]);
                }

                for (int i = 0; i < 2; i++) {
                    int dX = x + dx[i];
                    int dY = y + dy[i];
                    if (dX < N && dY < N) {
                        traverse(dX, dY, visitCnt[x][y]);
                    }
                }
            }

        }

        queue.clear();
    }

    private static void printVisitCnt() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visitCnt[i][j] == Integer.MAX_VALUE) {
                    System.out.print("-1 ");
                } else {
                    System.out.print(visitCnt[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void traverse(int x, int y, int prevCnt) {
        if (map[x][y] == 1) {
            if (visitCnt[x][y] == Integer.MAX_VALUE) {
                visitCnt[x][y] = map[x][y] + prevCnt;
                queue.add(new Point(x, y));
            } else if (visitCnt[x][y] > map[x][y] + prevCnt) {
                visitCnt[x][y] = map[x][y] + prevCnt;
                queue.add(new Point(x, y));
            }
        } else if (map[x][y] == 0) {
            if (!isCross(x, y)) {
                if (prevCnt <= M) {
                    visitCnt[x][y] = M;
                } else {
                    visitCnt[x][y] = prevCnt + 1;
                }
                queue.add(new Point(x, y));
            }
        } else if (map[x][y] > 1) {
            if (prevCnt <= map[x][y]) {
                visitCnt[x][y] = map[x][y];
            } else {
                visitCnt[x][y] = prevCnt + 1;
            }
            queue.add(new Point(x, y));
        }
    }

    private static boolean isCross(int x, int y) {
        if (x - 1 >= 0 && y - 1 >= 0) {
            if (map[x - 1][y] == 0 && map[x][y - 1] == 0) {
                return true;
            }
        }
        if (x + 1 < N && y + 1 < N) {
            if (map[x + 1][y] == 0 && map[x][y + 1] == 0) {
                return true;
            }
        }
        return false;
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
