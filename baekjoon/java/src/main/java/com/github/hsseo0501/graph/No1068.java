package com.github.hsseo0501.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1068 {
    static int N;
    static int M;

    static Queue<Integer> queue = new LinkedList<Integer>();
    static LinkedList<Integer>[] adjacentList;
    static int[] visit;
    static int numLeaf = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        adjacentList = new LinkedList[N];
        visit = new int[N];

        for(int i = 0;i < N; i++) {
            adjacentList[i] = new LinkedList<Integer>();
        }

        int rootNode = 0;
        for (int i = 0; i < N; i++) {
            visit[i] = 0;
            int v = scanner.nextInt();
            if (v == -1) {
                rootNode = i;
                continue;
            }
            adjacentList[i].add(v);
            adjacentList[v].add(i);
        }

        M = scanner.nextInt();
        removeNode(M);
        bfs(rootNode, M);
        System.out.println(numLeaf);
    }

    public static void removeNode(int v) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < adjacentList[i].size(); j++) {
                if (adjacentList[i].get(j) == v) {
                    adjacentList[i].remove(j);
                }
            }
        }
    }

    public static void bfs(int startV, int removed) {
        // 루트 지워지는 경우가 중요 포인트
        if(startV != removed) {
            visit[startV] = 1;
            queue.add(startV);
        }

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int i = 0; i < adjacentList[v].size(); i++) {
                int adjV = adjacentList[v].get(i);
                if(visit[adjV] == 0) {
                    visit[adjV] = 1;
                    queue.add(adjV);
                    if(adjacentList[adjV].size() == 1) {
                        numLeaf++;
                    }
                }
            }
        }
    }
}
