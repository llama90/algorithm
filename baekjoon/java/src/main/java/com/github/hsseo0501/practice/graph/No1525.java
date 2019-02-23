package com.github.hsseo0501.practice.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1525 {

    static final int MAX = 3;
    static int[][] map = new int[MAX][MAX];
    static int startX, startY;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                map[i][j] = in.nextInt();
                if (map[i][j] == 0) {
                    startX = i;
                    startY = j;
                }
            }
        }

        bfs();
    }

    static void bfs() {
        Queue<Point> queue = new LinkedList<Point>();
        queue.add(new Point(startX, startY, 0, map));

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.getX();
            int y = point.getY();
            int cnt = point.getPrevCnt();
            int[][] currMap = point.getMap();

            if (isTerminate(currMap)) {
                System.out.println(point.getPrevCnt());
                break;
            }

            for (int d = 0; d < 4; d++) {
                int dX = dx[d] + x;
                int dY = dy[d] + y;

                if (dX >= 0 && dY >= 0 && dX < MAX && dY < MAX) {
                    int[][] nextMap = copy(currMap);
                    nextMap = swap(nextMap, x, y, dX, dY);
                    queue.add(new Point(dX, dY, cnt + 1, nextMap));
                }
            }
        }
    }

    static int[][] copy(int[][] currMap) {
        int[][] nextMap = new int[MAX][MAX];
        for (int i = 0; i < MAX; i++) {
            for(int j = 0;j < MAX; j++) {
                nextMap[i][j] = currMap[i][j];
            }
        }
        return nextMap;
    }

    static int[][] swap(int[][] arr, int x, int y, int dx, int dy) {
        int temp = arr[x][y];
        arr[x][y] = arr[dx][dy];
        arr[dx][dy] = temp;
        return arr;
    }


    static boolean isFinished(int[][] map) {
        boolean isAns = true;
        boolean loop = true;
        int value = 1;
        for (int i = 0; i < MAX; i++) {
            if(!loop) {
                break;
            }
            for (int j = 0; j < MAX; j++) {
                if (value == 9 && map[i][j] == 0) {
                    continue;
                }
                if (map[i][j] != value++) {
                    isAns = false;
                    loop = false;
                    break;
                }
            }
        }
        return isAns;
    }

    static boolean isTerminate(int map[][]) {
        boolean isAns;
        if (map[MAX - 1][MAX - 1] == 0) {
            isAns = isFinished(map);
        } else {
            isAns = false;
        }
        return isAns;
    }

    static class Point {
        int x, y;
        int prevCnt;
        int[][] map;
        public Point(int x, int y, int prevCnt, int[][] map) {
            this.x = x;
            this.y = y;
            this.prevCnt = prevCnt;
            this.map = map;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getPrevCnt() {
            return prevCnt;
        }

        public int[][] getMap() {
            return map;
        }
    }

}
