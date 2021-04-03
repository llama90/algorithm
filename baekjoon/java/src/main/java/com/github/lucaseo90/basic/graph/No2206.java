package com.github.lucaseo90.basic.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No2206 {

    static int ASCII_OFFSET = 48;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static int N, M;
    static int[][] map;

    static boolean[][][] visitedMap;
    static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        in.nextLine();

        map = new int[N][M];
        visitedMap = new boolean[N][M][2];
        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - ASCII_OFFSET;
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        count = 0;
        Queue<Point> queue = new LinkedList<Point>();
        queue.add(new Point(0, 0, false));
        visitedMap[0][0][0] = true; // 3차원 인덱스가 0인 경우 블록이 깨지지 않은 경우의 맵

        while (!queue.isEmpty()) {
            int size = queue.size();
            count++;
            for (int q = 0; q < size; q++) {

                Point point = queue.poll();
                int x = point.getX();
                int y = point.getY();
                boolean blockBroken = point.getBlockBroken();

                if (x == N - 1 && y == M - 1) {
                    return count;
                }

                for (int i = 0; i < 4; i++) {
                    int dX = x + dx[i];
                    int dY = y + dy[i];

                    if (dX < 0 || dY < 0 || dX >= N || dY >= M) {
                        continue;
                    }

                    // 블록이 깨진 상태
                    if (blockBroken) {
                        // 벽이 아닌 곳만 지나갈 수 있음
                        if (map[dX][dY] == 0
                                && !visitedMap[dX][dY][0] && !visitedMap[dX][dY][1]) {
                            visitedMap[dX][dY][1] = true;
                            queue.add(new Point(dX, dY, true));
                        }
                    } else {
                        // 블록이 깨지지 않은 상태
                        // 벽이 아닌 곳을 지나가는 경우
                        if (map[dX][dY] == 0 && !visitedMap[dX][dY][0]) {
                            visitedMap[dX][dY][0] = true;
                            visitedMap[dX][dY][1] = true;
                            queue.add(new Point(dX, dY, false));
                            // 벽인 곳을 지나가는 경우
                        } else if (!visitedMap[dX][dY][0] && !visitedMap[dX][dY][1]) {
                            visitedMap[dX][dY][0] = true;
                            queue.add(new Point(dX, dY, true));
                        }
                    }
                }
            }
        }
        return -1;
    }

    static class Point {
        int x, y;
        boolean blockBroken;

        public Point(int x, int y, boolean blockBroken) {
            this.x = x;
            this.y = y;
            this.blockBroken = blockBroken;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public boolean getBlockBroken() {
            return blockBroken;
        }
    }
}
