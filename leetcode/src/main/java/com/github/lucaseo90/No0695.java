package com.github.lucaseo90;

import java.util.Stack;

public class No0695 {
    private final int[] dx = {0, 0, -1, 1};
    private final int[] dy = {-1, 1, 0, 0};

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][];
        for (int i = 0; i < m; i++) {
            visited[i] = new boolean[n];
        }

        int maxAreaOfIsland = 0;
        Stack<Point> stack = new Stack<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    stack.push(new Point(i, j));
                    visited[i][j] = true;

                    int countIslandArea = 0;
                    while (!stack.isEmpty()) {
                        Point currentPoint = stack.pop();
                        countIslandArea++;

                        int x = currentPoint.getX();
                        int y = currentPoint.getY();

                        for (int k = 0; k < dx.length; k++) {
                            int nextX = x + dx[k];
                            int nextY = y + dy[k];

                            if (nextX >= 0 && nextY >= 0 && nextX < m && nextY < n) {
                                if (!visited[nextX][nextY] && grid[nextX][nextY] == 1) {
                                    stack.push(new Point(nextX, nextY));
                                    visited[nextX][nextY] = true;
                                }
                            }
                        }
                    }
                    if (countIslandArea > maxAreaOfIsland) {
                        maxAreaOfIsland = countIslandArea;
                    }
                }
            }
        }
        return maxAreaOfIsland;
    }

    private class Point {
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
