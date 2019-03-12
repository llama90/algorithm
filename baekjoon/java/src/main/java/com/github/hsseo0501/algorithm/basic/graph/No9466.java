package com.github.hsseo0501.algorithm.basic.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No9466 {

    static int T, N;
    static int[] src;
    static int[] dst;
    static boolean[] checked;
    static boolean[] visited;
    static int countCycle;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine().trim());
        StringTokenizer st;

        for (int t = 0; t < T; t++) {
            N = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine().trim());

            src = new int[N + 1];
            dst = new int[N + 1];
            checked = new boolean[N + 1];
            visited = new boolean[N + 1];
            countCycle = 0;

            for (int i = 1; i <= N; i++) {
                src[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= N; i++) {
                if (!checked[i]) {
                    dfs(i);
                }
            }

            System.out.println(N - countCycle);
        }
    }

    static void dfs(int v) {
        visited[v] = true;
        int next = src[v];
        if (!visited[next]) {
            dst[next] = v;
            dfs(next);
        } else {
            if (!checked[next]) {
                countCycle(v, src[v]);
            }
        }
        checked[v] = true;
    }

    static void countCycle(int v, int next) {
        countCycle++;
        if (v == next) {
            return;
        }
        countCycle(dst[v], next);
    }

}
