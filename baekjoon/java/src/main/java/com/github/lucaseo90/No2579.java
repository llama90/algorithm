package com.github.lucaseo90;

import java.util.PriorityQueue;
import java.util.Scanner;

public class No2579 {

    static int N;
    static int[] stairCount;
    static PriorityQueue<Stair> queue = new PriorityQueue<Stair>();
    static int score = 0;
    static int[] cache;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        stairCount = new int[N + 1];
        cache = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            stairCount[i] = in.nextInt();
        }

        solve();

        System.out.println(score);

    }

    private static void solve() {
        cache[1] = stairCount[1];
        queue.add(new Stair(1, stairCount[1], 1));

        while (!queue.isEmpty()) {
            Stair stair = queue.poll();
            int index = stair.getIndex();
            int accumulatedScore = stair.getAccumulatedScore();
            int count = stair.getCount();
            System.out.println(index + " | " + accumulatedScore + " | " + count);

            if (index < N) {
                if (index + 1 <= N && count < 2) {
                    count++;
                    if (cache[count] < accumulatedScore + stairCount[count]) {
                        cache[count] = accumulatedScore + stairCount[count];
                        queue.add(new Stair(index + 1, accumulatedScore + stairCount[count], count));
                    }
                }

                if (index + 2 <= N) {
                    count = 1;
                    if (cache[count] < cache[count - 1] + stairCount[count]) {
                        cache[count] = cache[count - 1] + stairCount[count];
                        queue.add(new Stair(index + 2, cache[count - 1] + stairCount[index + 2], count));
                    }

                    if (cache[index + 2] < accumulatedScore + stairCount[index + 2]) {
                        count = 1;
                        queue.add(new Stair(index + 2, accumulatedScore + stairCount[index + 2], count));
                    }
                }
            }

            if (index == N) {
                if (score < accumulatedScore) {
                    score = accumulatedScore;
                }
            }
        }
    }

    private static class Stair implements Comparable<Stair> {
        int index;
        int accumulatedScore;
        int count;

        public Stair(int index, int accumulatedScore, int count) {
            this.index = index;
            this.accumulatedScore = accumulatedScore;
            this.count = count;
        }

        public int getIndex() {
            return index;
        }

        public int getAccumulatedScore() {
            return accumulatedScore;
        }

        public int getCount() {
            return count;
        }

        public int compareTo(Stair o) {
            if (this.accumulatedScore < o.accumulatedScore) {
                return 1;
            } else if (this.accumulatedScore > o.accumulatedScore) {
                return -1;
            }
            return 0;
        }
    }
}
