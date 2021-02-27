package graphs;

public class ConnectedCell {
    private static final int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
    private static int maxRegion = 0;
    private static int countRegion = 0;

    // Complete the maxRegion function below.
    static int maxRegion(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    visited[i][j] = true;
                    countRegion = 1;
                    findConnectedCell(grid, visited, i, j, n, m);
                    if (countRegion > maxRegion) {
                        maxRegion = countRegion;
                    }
                }
            }
        }

        return maxRegion;
    }

    static void findConnectedCell(int[][] grid, boolean[][] visited, int x, int y, int n, int m) {
        if (x < 0 || y < 0 || x >= n || y >= m) {
            return;
        }

        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
                if (!visited[nextX][nextY] && grid[nextX][nextY] == 1) {
                    countRegion++;
                    visited[nextX][nextY] = true;
                    findConnectedCell(grid, visited, nextX, nextY, n, m);
                }
            }
        }
    }

}
