package array;

public class TheLargestHourGlass {
    private static final int[] dx = {-1, -1, -1, 0, 1, 1, 1,};
    private static final int[] dy = {-1, 0, 1, 0, -1, 0, 1};

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int largestHourglass = Integer.MIN_VALUE;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                int hourglass = 0;
                for (int k = 0; k < dx.length; k++) {
                    int x = dx[k] + i;
                    int y = dy[k] + j;
                    hourglass += arr[x][y];
                }

                if (largestHourglass < hourglass) {
                    largestHourglass = hourglass;
                }
            }
        }
        return largestHourglass;
    }
}
