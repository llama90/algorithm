package com.github.lucaseo90.algorithm.intermediate.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class No1766 {

    static int N, M;
    static ArrayList<Integer>[] adjacentList;
    static int inDegree[];
    static ArrayList<Integer> sortedVertices = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        adjacentList = new ArrayList[N + 1];
        inDegree = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            adjacentList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int src = scanner.nextInt();
            int dst = scanner.nextInt();
            adjacentList[src].add(dst);
            inDegree[dst]++;
        }

        topologicalSort();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sortedVertices.size(); i++) {
            sb.append(sortedVertices.get(i) + " ");
        }
        System.out.println(sb);
    }

    static void topologicalSort() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        for (int i = 0; i < N; i++) {
            int v = queue.poll();
            sortedVertices.add(v);

            for (int j = 0; j < adjacentList[v].size(); j++) {
                int adjV = adjacentList[v].get(j);
                inDegree[adjV]--;

                if (inDegree[adjV] == 0) {
                    queue.add(adjV);
                }
            }
        }
    }

}
