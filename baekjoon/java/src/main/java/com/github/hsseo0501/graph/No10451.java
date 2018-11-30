package com.github.hsseo0501.graph;

import java.util.LinkedList;
import java.util.Scanner;

public class No10451 {
    static int T;
    static int N;
    static int numCycle = 0;
    static boolean[] visit;
    static LinkedList<Integer>[] adjacentList;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            N = scanner.nextInt();
            visit = new boolean[N + 1];
            adjacentList = new LinkedList[N + 1];
            for (int j = 1; j <= N; j++) {
                adjacentList[j] = new LinkedList<Integer>();
            }

            for (int j = 1; j <= N; j++) {
                int v = scanner.nextInt();
                adjacentList[j].add(v);
            }

            for (int j = 1; j <= N; j++) {
                dfs(j, j);
            }

            System.out.println(numCycle);
            numCycle = 0;
        }
    }

    public static void dfs(int start, int first) {
        visit[start] = true;

        for(int adj : adjacentList[start]) {
            if(!visit[adj]) {
                dfs(adj, first);
            } else if(visit[adj]) {
                if(adj == first) {
                    numCycle++;
                }
            }
        }
    }
}
