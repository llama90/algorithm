package com.github.hsseo0501.basic.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1697 {

    static final int MIN = 0;
    static final int MAX = 100000;

    static int N, K;
    static int dist[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();

        dist = new int[MAX + 1];
        Arrays.fill(dist, -1);

        bfs();
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(N);
        dist[N] = 0;

        while (!queue.isEmpty()) {
            int value = queue.poll();

            if (value == K) {
                System.out.println(dist[value]);
                break;
            }

            int next = value - 1;
            if (next >= MIN && dist[next] == -1) {
                dist[next] = dist[value] + 1;
                queue.add(next);
            }

            next = value + 1;
            if (next <= MAX && dist[next] == -1) {
                dist[next] = dist[value] + 1;
                queue.add(next);
            }

            next = value * 2;
            if (next <= MAX && dist[next] == -1) {
                dist[next] = dist[value] + 1;
                queue.add(next);
            }
        }
    }
}
