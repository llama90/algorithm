package com.github.hsseo0501.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No5567 {
    static int N;
    static int M;
    static LinkedList<Integer>[] adjacentList;
    static int[] visit;
    static Queue<Integer> queue = new LinkedList<Integer>();
    static int numFriends = 0;
    static final int START_NODE_VISIT_NUMBER = 0;
    static final int TWO_HOP_NBR_VISIT_NUMBER = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        adjacentList = new LinkedList[N + 1];
        visit = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            adjacentList[i] = new LinkedList<Integer>();
            visit[i] = -1;
        }

        for (int i = 0; i < M; i++) {
            int s = scanner.nextInt();
            int d = scanner.nextInt();
            adjacentList[s].add(d);
            // 양방향 그래프로 표현해야함..
            adjacentList[d].add(s);
        }

        bfs(1);
        acc();
        System.out.println(numFriends);
    }

    public static void bfs(int start) {
        visit[start] = 0;
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int i = 0; i < adjacentList[v].size(); i++) {
                int nbr = adjacentList[v].get(i);
                if (visit[nbr] == -1) {
                    visit[nbr] = (visit[v] + 1);
                    queue.add(nbr);
                }
            }
        }
    }

    public static void acc() {
        for (int i = 1; i <= N; i++) {
            if (visit[i] <= TWO_HOP_NBR_VISIT_NUMBER
                    && visit[i] > START_NODE_VISIT_NUMBER) {
                numFriends++;
            }
        }
    }
}
