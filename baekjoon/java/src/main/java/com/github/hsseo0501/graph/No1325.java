package com.github.hsseo0501.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class No1325 {
    static int N;
    static int M;
    static int[][] visit = new int[10001][10001];
    static LinkedList<Integer>[] adjacentList;
    static int numVisit = 0;
    static int largestVisit = 0;
    static HashMap<Integer, Integer> visitCountMap = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        adjacentList = new LinkedList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjacentList[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int s = scanner.nextInt();
            int d = scanner.nextInt();
            adjacentList[d].add(s);
        }

        for (int i = 1; i <= N; i++) {
            initVisit();
            dfs(i, i);
            visitCountMap.put(i, numVisit);

            if (largestVisit < numVisit) {
                largestVisit = numVisit;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (visitCountMap.get(i) == largestVisit) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void initVisit() {
        numVisit = 0;
    }

    public static void dfs(int start, int idx) {
        visit[idx][start] = 1;

        for (int i = 0; i < adjacentList[start].size(); i++) {
            int adj = adjacentList[start].get(i);
            if (visit[idx][adj] == 0) {
                numVisit++;
                dfs(adj, idx);
            }
        }
    }
}
