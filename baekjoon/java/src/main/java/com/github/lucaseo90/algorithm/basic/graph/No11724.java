package com.github.lucaseo90.algorithm.basic.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No11724 {

    static int N;
    static int M;

    static ArrayList<Integer>[] adjacentList;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<Integer>();

    static int numConn = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        adjacentList = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            adjacentList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int s = in.nextInt() - 1;
            int d = in.nextInt() - 1;

            adjacentList[s].add(d);
            adjacentList[d].add(s);
        }

        bfs();

        System.out.println(numConn);

    }

    static void bfs() {

        checkNotVisitedVertex();

        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (int i = 0; i < adjacentList[v].size(); i++) {
                int adjV = adjacentList[v].get(i);
                if (!visited[adjV]) {
                    visited[adjV] = true;
                    queue.add(adjV);
                }
            }

            if (queue.isEmpty()) {
                checkNotVisitedVertex();
            }

        }
    }

    static void checkNotVisitedVertex() {
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                queue.add(i);
                numConn++;
                break;
            }
        }
    }
}
