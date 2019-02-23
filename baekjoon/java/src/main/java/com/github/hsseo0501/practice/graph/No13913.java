package com.github.hsseo0501.practice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No13913 {

    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 100000;

    static int N;
    static int K;
    static boolean[] visited = new boolean[MAX_VALUE + 1];
    static int[] path = new int[MAX_VALUE + 1];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();

//        long start = System.currentTimeMillis();
        bfs();
//        System.out.println(System.currentTimeMillis() - start);
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(N);

        while (!queue.isEmpty()) {
            Integer value = queue.poll();

            if (value == K) {
                ArrayList<Integer> paths = new ArrayList<Integer>();
                int prevPath = value;
                while (prevPath != N) {
                    paths.add(prevPath);
                    prevPath = path[prevPath];
                }
                paths.add(N);

//                long start = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                System.out.println(paths.size() - 1);
                for (int i = paths.size() - 1; i >= 0; i--) {
                    sb.append(paths.get(i) + " ");
                }
                System.out.println(sb);
//                System.out.println("print time: " + (System.currentTimeMillis() - start));
                break;
            }

            int next = value - 1;
            if (next >= MIN_VALUE && !visited[next]) {
                visited[next] = true;
                path[next] = value;
                queue.add(next);
            }

            next = value + 1;
            if (next <= MAX_VALUE && !visited[next]) {
                visited[next] = true;
                path[next] = value;
                queue.add(next);
            }

            next = value * 2;
            if (next <= MAX_VALUE && !visited[next]) {
                visited[next] = true;
                path[next] = value;
                queue.add(next);
            }
        }

        queue.clear();
    }
}
