package com.github.hsseo0501.graph;

import java.util.LinkedList;
import java.util.Scanner;

public class No1325 {
    static int N;
    static int M;
    static short[] visitCnt = new short[10001];
    static boolean[][] visit = new boolean[10001][10001];
    static LinkedList<Short>[] adjacentList = new LinkedList[10001];
    static short numVisit = 0;
    static short largestVisit = 0;

    static Runtime r = Runtime.getRuntime();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            adjacentList[i] = new LinkedList<Short>();
        }

        for (int i = 0; i < M; i++) {
            int s = scanner.nextInt();
            int d = scanner.nextInt();
            adjacentList[d].add((short)s);
        }

        for (int i = 1; i <= N; i++) {
            initVisit();
            dfs(i, i);
            visitCnt[i] = numVisit;

            if (largestVisit < numVisit) {
                largestVisit = numVisit;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (visitCnt[i] == largestVisit) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void initVisit() {
        numVisit = 0;
    }

    public static void dfs(int start, int idx) {
        visit[idx][start] = true;

        for (int i = 0; i < adjacentList[start].size(); i++) {
            int adj = adjacentList[start].get(i);
            if (visit[idx][adj] == false) {
                numVisit++;
                dfs(adj, idx);
            }
        }
    }
}
