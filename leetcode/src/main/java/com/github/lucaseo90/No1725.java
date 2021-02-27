package com.github.lucaseo90;

public class No1725 {
    public static int countGoodRectangles(int[][] rectangles) {
        int largestSquare = 0;
        int numberOfLargestSquare = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int length = rectangles[i][0];
            int width = rectangles[i][1];
            int minSide = Math.min(length, width);

            if (largestSquare < minSide) {
                largestSquare = minSide;
                numberOfLargestSquare = 1;
            } else if (minSide == largestSquare) {
                numberOfLargestSquare++;
            }
        }

        return numberOfLargestSquare;
    }
}
