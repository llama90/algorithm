package com.github.lucaseo90.practice.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class No9019 {

    static final int MAX = 10000;

    static int N;
    static boolean[] visited = new boolean[MAX];
    static int[] path = new int[MAX];
    static char[] operator = new char[MAX];
    static char[] op = {'D', 'S', 'L', 'R'};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        for (int testCase = 1; testCase <= N; testCase++) {
            int start = in.nextInt();
            int end = in.nextInt();

            visited = new boolean[MAX];
            path = new int[MAX];
            operator = new char[MAX];

            bfs(start, end);
        }
    }

    static void bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int value = queue.poll();

            if (value == end) {
                Stack<Character> paths = new Stack<Character>();

                while (start != end) {
                    paths.push(operator[end]);
                    end = path[end];
                }

                StringBuilder sb = new StringBuilder();
                int size = paths.size();
                for (int i = 0; i < size; i++) {
                    sb.append(paths.pop());
                }
                System.out.println(sb);
                break;
            }

            int next[] = new int[4];
            next[0] = operateD(value);
            next[1] = operateS(value);
            next[2] = operateL(value);
            next[3] = operateR(value);

            for (int i = 0; i < next.length; i++) {
                if (next[i] < MAX && !visited[next[i]]) {
                    visited[next[i]] = true;
                    queue.add(next[i]);

                    path[next[i]] = value;
                    operator[next[i]] = op[i];
                }
            }
        }
    }

    static int operateD(int value) {
        return (value * 2) % 10000;
    }

    static int operateS(int value) {
        return (value + 9999) % 10000;
    }

    static int operateL(int value) {
        if (value == 0) return 0;
        int first = value / 1000;
        int last = value % 1000;
        return (last) * 10 + first;
    }

    static int operateR(int value) {
        if (value == 0) return 0;
        int last = value % 10;
        return value / 10 + last * 1000;
    }
}
