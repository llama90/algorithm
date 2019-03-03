package com.github.hsseo0501.basic.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No13549 {
    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 100000;

    static int N;
    static int K;
    static int[] cnt = new int[MAX_VALUE + 1];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();

        Arrays.fill(cnt, -1);

        bfs();
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(N);
        cnt[N] = 0;

        while (!queue.isEmpty()) {
            Integer value = queue.poll();

            if (value == K) {
                System.out.println(cnt[value]);
                break;
            }

            int next = value * 2;
            if (next <= MAX_VALUE && cnt[next] == -1) {
                cnt[next] = cnt[value];
                queue.add(next);
            }

            next = value - 1;
            if (next >= MIN_VALUE && cnt[next] == -1) {
                cnt[next] = cnt[value] + 1;
                queue.add(next);
            }

            next = value + 1;
            if (next <= MAX_VALUE && cnt[next] == -1) {
                cnt[next] = cnt[value] + 1;
                queue.add(next);
            }
        }

        queue.clear();
    }
}
