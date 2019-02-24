package com.github.hsseo0501.basics.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No1707 {

    static char NONE = 'n';
    static char RED = 'r';
    static char BLUE = 'b';

    static int K, V, E;

    static ArrayList<Integer>[] adjacentList;
    static char[] color;
    static boolean isBipartite = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        K = in.nextInt();

        for (int testCase = 1; testCase <= K; testCase++) {
            V = in.nextInt();
            E = in.nextInt();

            adjacentList = new ArrayList[V];
            color = new char[V];
            isBipartite = true;
            Arrays.fill(color, NONE);
            for (int i = 0; i < V; i++) {
                adjacentList[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < E; i++) {
                int s = in.nextInt() - 1;
                int d = in.nextInt() - 1;
                adjacentList[s].add(d);
                adjacentList[d].add(s);
            }

            for (int i = 0; i < V; i++) {
                if (isBipartite) {
                    if (color[i] == NONE) {
                        color[i] = RED;
                        dfs(i);
                    }
                } else {
                    break;
                }
            }

            if (isBipartite) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static void dfs(int v) {
        if (!isBipartite) {
            return;
        }

        char vColor = color[v];
        for (int i = 0; i < adjacentList[v].size(); i++) {
            int adj = adjacentList[v].get(i);
            if (color[adj] == NONE) {
                if (vColor == RED) {
                    color[adj] = BLUE;
                    dfs(adj);
                } else if (vColor == BLUE) {
                    color[adj] = RED;
                    dfs(adj);
                }
            } else {
                if (vColor == color[adj]) {
                    isBipartite = false;
                }
            }
        }
    }
}
