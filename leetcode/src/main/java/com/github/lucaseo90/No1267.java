package com.github.lucaseo90;

public class No1267 {
    private final int[] dx = {-1, 1, 0, 0};
    private final int[] dy = {0, 0, -1, 1};

    private int communicatedServer = 0;

    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        communicatedServer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    traverse(grid, visited, i, j, n, m, 0);
                }
            }
        }
        return communicatedServer;
    }

    public void traverse(int[][] grid, boolean[][] visited, int x, int y, int n, int m, int depth) {
        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            while (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
                if (grid[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    communicatedServer++;
                    traverse(grid, visited, nextX, nextY, n, m, depth + 1);
                }
                nextX += dx[i];
                nextY += dy[i];
            }
        }
    }
}
