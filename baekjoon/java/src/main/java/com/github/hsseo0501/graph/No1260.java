package com.github.hsseo0501.graph;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1260 {
    static int N;
    static int M;
    static int V;
    static int[] visited;
    static Queue<Integer> queue = new LinkedList<Integer>();
    static LinkedList<Integer>[] adjacentList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        V = scanner.nextInt();
        visited = new int[N + 1];
        adjacentList = new LinkedList[N + 1];

        for (int i = 1; i <= N; i++) {
            visited[i] = 0;
            adjacentList[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int src = scanner.nextInt();
            int dst = scanner.nextInt();
            adjacentList[src].add(dst);
            adjacentList[dst].add(src);
        }

        for(int i = 1;i < N; i++) {
            Collections.sort(adjacentList[i]);
        }

        dfs(V);
        System.out.println();
        for (int i = 1; i <= N; i++) {
            visited[i] = 0;
        }
        bfs();
    }

    public static void bfs() {
        queue.add(V);
        visited[V] = 1;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            for (int i = 0; i < adjacentList[v].size(); i++) {
                int adjacentV = adjacentList[v].get(i);
                if (visited[adjacentV] != 1) {
                    queue.add(adjacentV);
                    visited[adjacentV] = 1;
                }
            }
        }
        System.out.println();
    }

    public static void dfs(int start) {
        System.out.print(start + " ");
        visited[start] = 1;
        for (int i = 0; i < adjacentList[start].size(); i++) {
            int adjacentV = adjacentList[start].get(i);
            if(visited[adjacentV] == 0) {
                dfs(adjacentV);
            }
        }
    }
}
