package com.github.lucaseo90.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No2606 {
    static int N;
    static int M;

    static int[] visit;
    static LinkedList<Integer>[] adjacentList;
    static Queue<Integer> queue = new LinkedList<Integer>();
    static int numComputer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        visit = new int[N + 1];
        adjacentList = new LinkedList[N + 1];
        for (int i = 1; i <= N; i++) {
            visit[i] = 0;
            adjacentList[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int s = scanner.nextInt();
            int d = scanner.nextInt();

            adjacentList[s].add(d);
            adjacentList[d].add(s);
        }

        bfs(1);
        System.out.println(numComputer);
    }

    public static void bfs(int start) {
        visit[start] = 1;
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int i = 0; i < adjacentList[v].size(); i++) {
                int adj = adjacentList[v].get(i);
                if(visit[adj] == 0) {
                    visit[adj] = 1;
                    queue.add(adj);
                    numComputer++;
                }
            }
        }
    }
}
