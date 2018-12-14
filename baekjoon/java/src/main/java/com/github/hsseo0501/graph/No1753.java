package com.github.hsseo0501.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1753 {
    static int V;
    static int E;
    static int K;

    static int[] costMap;
    static LinkedList<Vertex>[] adjacentList;
    static Queue<Vertex> queue = new LinkedList<Vertex>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        V = scanner.nextInt();
        E = scanner.nextInt();
        K = scanner.nextInt();

        costMap = new int[V + 1];
        adjacentList = new LinkedList[V + 1];
        for (int i = 1; i <= V; i++) {
            costMap[i] = Integer.MAX_VALUE;
            adjacentList[i] = new LinkedList<Vertex>();
        }

        for (int i = 0; i < E; i++) {
            int src = scanner.nextInt();
            int dst = scanner.nextInt();
            int cost = scanner.nextInt();
            adjacentList[src].add(new Vertex(dst, cost));
        }

        bfs(new Vertex(K, 0));
        printCost();
    }

    public static void bfs(Vertex start) {
        queue.add(start);
        costMap[start.getIdx()] = start.getCost();

        while (!queue.isEmpty()) {
            Vertex v = queue.poll();
            int vIdx = v.getIdx();
            for (int i = 0; i < adjacentList[vIdx].size(); i++) {
                Vertex adj = adjacentList[vIdx].get(i);
                int vAdj = adj.getIdx();
                int cost = costMap[vIdx] + adj.getCost();
                if (costMap[vAdj] > cost) {
                    costMap[vAdj] = cost;
                }
                queue.add(adj);
            }
        }
    }

    public static void printCost() {
        for (int i = 1; i <= V; i++) {
            if (costMap[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(costMap[i]);
            }
        }
    }

    private static class Vertex {
        int idx;
        int cost;

        public Vertex(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }

        public int getIdx() {
            return idx;
        }

        public int getCost() {
            return cost;
        }
    }

}
