package com.github.hsseo0501.basics.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class No13023 {

    static int N;
    static int M;

    static ArrayList<Integer>[] adjacentList;
    static boolean[] visited;

    static int maxCnt = 0;

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
            int s = in.nextInt();
            int d = in.nextInt();

            adjacentList[s].add(d);
            adjacentList[d].add(s);
        }

        for (int i = 0; i < N; i++) {
            dfs(0, i);
            if(maxCnt == 4) {
                break;
            }
        }

        if (maxCnt == 4) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    static void dfs(int count, int n) {
        if (count == 4) {
            maxCnt = 4;
            return;
        }

        visited[n] = true;
        for (int i = 0; i < adjacentList[n].size(); i++) {
            int next = adjacentList[n].get(i);
            if (visited[next]) {
                continue;
            }
            dfs(count + 1, next);
            if (maxCnt == 4) {
                return;
            }
        }
        visited[n] = false;
    }

}
