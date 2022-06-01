package com.github.lucaseo90.medium;

import java.util.LinkedList;
import java.util.Queue;

public class No0695 {
    private final int[] dx = {1, -1, 0, 0};
    private final int[] dy = {0, 0, 1, -1};

    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][];
        for (int i = 0; i < n; i++) {
            visited[i] = new boolean[m];
        }

        int largestIsland = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int islandSize = this.traverseIsland(grid, visited, i, j, n, m);
                    if (largestIsland < islandSize) {
                        largestIsland = islandSize;
                    }
                }
            }
        }
        return largestIsland;
    }

    private int traverseIsland(int[][] grid, boolean[][] visited, int startX, int startY, int n, int m) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX, startY));

        int size = 0;

        size++;
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.x;
            int y = point.y;

            for (int i = 0; i < dx.length; i++) {
                int dx = x + this.dx[i];
                int dy = y + this.dy[i];

                if (dx >= 0 && dy >= 0 && dx < n && dy < m) {
                    if (!visited[dx][dy] && grid[dx][dy] == 1) {
                        queue.add(new Point(dx, dy));
                        visited[dx][dy] = true;
                        size++;
                    }
                }
            }
        }

        return size;
    }

    private class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
