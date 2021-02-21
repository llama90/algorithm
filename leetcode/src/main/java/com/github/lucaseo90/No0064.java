package com.github.lucaseo90;

public class No0064 {
    private final int[] dx = new int[]{0, 1};
    private final int[] dy = new int[]{1, 0};
    private int minimumPathSum = Integer.MAX_VALUE;
    private int M, N;

    public int minPathSum(int[][] grid) {
        M = grid.length;
        N = grid[0].length;

        boolean[][] visited = new boolean[M][N];
        traverse(visited, grid, 0, 0, grid[0][0]);
        return minimumPathSum;
    }

    public void traverse(boolean[][] visited, int[][] grid, int x, int y, int pathSum) {
        if (M - 1 == x && N - 1 == y) {
            if (pathSum < minimumPathSum) {
                minimumPathSum = pathSum;
            }
            return;
        }

        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX < M && nextY < N && !visited[x][y]) {
                int currentSum = pathSum + grid[nextX][nextY];
                if (currentSum < minimumPathSum) {
                    visited[x][y] = true;
                    traverse(visited, grid, nextX, nextY, pathSum + grid[nextX][nextY]);
                    visited[x][y] = false;
                }
            }
        }
    }
}