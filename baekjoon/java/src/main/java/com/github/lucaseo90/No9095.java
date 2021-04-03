package com.github.lucaseo90;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No9095 {

    private static Queue<Integer> queue = new LinkedList<Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int n = in.nextInt();
            System.out.println(bfs(n));
        }
    }

    private static int bfs(int n) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <= 3; i++) {
            if (i <= n) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int v = queue.poll();

            if (v == n) {
                count++;
            } else {
                for (int i = 1; i <= 3; i++) {
                    if (v + i <= n) {
                        queue.add(v + i);
                    }
                }
            }
        }
        return count;
    }
}
