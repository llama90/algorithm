package com.github.lucaseo90;

public class No0063 {
    final int dx[] = new int[]{-1, 0};
    final int dy[] = new int[]{0, -1};

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] memo = new int[m][];
        for (int i = 0; i < m; i++) {
            memo[i] = new int[n];
        }

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] != 1 && i == 0 && j == 0) {
                    memo[i][j] = 1;
                } else {
                    if (obstacleGrid[i][j] != 1) {
                        for (int k = 0; k < dx.length; k++) {
                            int prevX = i + dx[k];
                            int prevY = j + dy[k];

                            if (prevX >= 0 && prevY >= 0 && obstacleGrid[prevX][prevY] != -1) {
                                memo[i][j] += memo[prevX][prevY];
                            }
                        }
                    }
                }
            }
        }

        return memo[m - 1][n - 1];
    }
}
