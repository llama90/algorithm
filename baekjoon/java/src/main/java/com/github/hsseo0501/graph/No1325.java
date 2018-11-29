package com.github.hsseo0501.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class No1325 {
    static int N;
    static int M;
    static int[] visitCnt = new int[10001];
    static boolean[] visit = new boolean[10001];
    static ArrayList<Integer>[] adjacentList = new ArrayList[10001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            adjacentList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int s = scanner.nextInt();
            int d = scanner.nextInt();
            adjacentList[s].add(d);
        }

        long start = System.currentTimeMillis();
        int largestVisit = 0;
        for (int i = 1; i <= N; i++) {
            visit = new boolean[10001];
            dfs(i);
        }

        for (int i = 1; i <= N; i++) {
            if (largestVisit < visitCnt[i]) {
                largestVisit = visitCnt[i];
            }
        }

        System.out.println(System.currentTimeMillis() - start);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (visitCnt[i] == largestVisit) {
                sb.append(i + " ");
            }
        }
        System.out.println(sb);
    }

    public static void dfs(int start) {
        visit[start] = true;

        for (int adj : adjacentList[start]) {
            if (!visit[adj]) {
                visitCnt[adj]++;
                dfs(adj);
            }
        }
    }
}
