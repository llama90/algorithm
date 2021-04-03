package com.github.lucaseo90.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class No1753 {
    static int V;
    static int E;
    static int K;

    static int[] costArr;
    static boolean[] visitArr;
    static LinkedList<Vertex>[] adjacentList;
    static PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        V = scanner.nextInt();
        E = scanner.nextInt();
        K = scanner.nextInt();

        costArr = new int[V + 1];
        visitArr = new boolean[V + 1];
        adjacentList = new LinkedList[V + 1];

        Arrays.fill(costArr, Integer.MAX_VALUE);
        costArr[K] = 0;
        for (int i = 1; i <= V; i++) {
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

        while (!queue.isEmpty()) {
            Vertex v = queue.poll();

            if(visitArr[v.getIdx()]){
                continue;
            }
            visitArr[v.getIdx()] = true;

            int vId = v.getIdx();
            for(Vertex adj : adjacentList[vId]) {
                if (visitArr[adj.getIdx()] == false) {
                    costArr[adj.getIdx()] = Math.min(costArr[adj.getIdx()], costArr[vId] + adj.getCost());
                    queue.offer(new Vertex(adj.getIdx(), costArr[adj.getIdx()]));
                }
            }
        }
    }

    public static void printCost() {
        for (int i = 1; i <= V; i++) {
            if (costArr[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(costArr[i]);
            }
        }
    }

    private static class Vertex implements Comparable<Vertex> {
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

        public int compareTo(Vertex o) {
            return this.cost < o.cost ? -1 : 1;
        }
    }

}
