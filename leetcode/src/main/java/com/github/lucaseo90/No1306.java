package com.github.lucaseo90;

import java.util.LinkedList;
import java.util.Queue;

public class No1306 {
    public boolean canReach(int[] arr, int start) {
        boolean answer = false;
        boolean[] visited = new boolean[arr.length];
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(start, arr[start]));

        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            int value = currentPoint.getValue();
            int index = currentPoint.getIndex();
            visited[index] = true;
            if (currentPoint.getValue() == 0) {
                answer = true;
                break;
            }

            int rightJumpIndex = index + value;
            int leftJumpIndex = index - value;
            if (rightJumpIndex < arr.length && !visited[rightJumpIndex]) {
                queue.add(new Point(rightJumpIndex, arr[rightJumpIndex]));
            }

            if (leftJumpIndex >= 0 && !visited[leftJumpIndex]) {
                queue.add(new Point(leftJumpIndex, arr[leftJumpIndex]));
            }
        }

        return answer;
    }

    public class Point {
        int index;
        int value;

        public Point(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public int getValue() {
            return value;
        }
    }
}
