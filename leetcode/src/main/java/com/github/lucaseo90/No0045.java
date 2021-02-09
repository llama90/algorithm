package com.github.lucaseo90;

import java.util.LinkedList;
import java.util.Queue;

public class No0045 {
    public int jump(int[] nums) {
        int answer = Integer.MAX_VALUE;
        boolean[] visited = new boolean[nums.length];

        Queue<Point> queue = new LinkedList<>();
        int startIndex = 0;
        int finishIndex = nums.length - 1;

        Point startPoint = new Point(startIndex, startIndex, nums[startIndex]);
        queue.add(startPoint);

        while (!queue.isEmpty()) {
            Point curr = queue.poll();
            int currIndex = curr.getIndex();
            int currNumberOfJump = curr.getNumberOfJump();
            int jumpRange = curr.getJumpRange();
            visited[currIndex] = true;

            if (currIndex == finishIndex) {
                answer = currNumberOfJump;
                break;
            }

            for (int i = 1; i <= jumpRange; i++) {
                int nextIndex = currIndex + i;
                if (nextIndex < nums.length && !visited[nextIndex]) {
                    queue.add(new Point(nextIndex, currNumberOfJump + 1, nums[nextIndex]));
                }
            }
        }

        return answer;
    }

    public class Point {
        int index;
        int numberOfJump;
        int jumpRange;

        public Point(int index, int numberOfJump, int jumpRange) {
            this.index = index;
            this.numberOfJump = numberOfJump;
            this.jumpRange = jumpRange;
        }

        public int getIndex() {
            return index;
        }

        public int getNumberOfJump() {
            return numberOfJump;
        }

        public int getJumpRange() {
            return jumpRange;
        }
    }
}
