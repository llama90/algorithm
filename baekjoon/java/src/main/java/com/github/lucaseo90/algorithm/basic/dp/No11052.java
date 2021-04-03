package com.github.lucaseo90.algorithm.basic.dp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No11052 {

    static int N;
    static int[] price;
    static int[] maxPrice;
    static int maximumPrice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        price = new int[N + 1];
        maxPrice = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            price[i] = scanner.nextInt();
        }

        long start = System.currentTimeMillis();
        dp();
        System.out.println((System.currentTimeMillis() - start) / 1000.0 + "ms");

        start = System.currentTimeMillis();
        bfs();
        System.out.println((System.currentTimeMillis() - start) / 1000.0 + "ms");

        Arrays.fill(maxPrice, 0);
        start = System.currentTimeMillis();
        bfsPruning();
        System.out.println((System.currentTimeMillis() - start) / 1000.0 + "ms");
    }

    static void dp() {
        int cntSolving = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                maxPrice[i] = Math.max(maxPrice[i], price[j] + maxPrice[i - j]);
                cntSolving++;
            }
        }

        System.out.println(maxPrice[N]);
        System.out.println("solving count: " + cntSolving);
    }

    static void bfs() {
        int cntSolving = 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(0, 0));
        while (!queue.isEmpty()) {
            cntSolving++;
            Node node = queue.poll();
            int cost = node.getCost();
            int step = node.getStep();

            if (step == N) {
                if (maximumPrice < cost) {
                    maximumPrice = cost;
                }
            }

            for (int i = 1; i <= N; i++) {
                int nextStep = step + i;
                int nextCost = cost + price[i];
                if (nextStep <= N) {
                    queue.add(new Node(nextCost, nextStep));
                }
            }
        }

        System.out.println(maximumPrice);
        System.out.println("solving count: " + cntSolving);
    }

    static void bfsPruning() {
        int cntSolving = 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(0, 0));
        while (!queue.isEmpty()) {
            cntSolving++;
            Node node = queue.poll();
            int cost = node.getCost();
            int step = node.getStep();

            for (int i = 1; i <= N; i++) {
                int nextStep = step + i;
                int nextCost = cost + price[i];
                if (nextStep <= N) {
                    if (maxPrice[nextStep] < nextCost) {
                        maxPrice[nextStep] = nextCost;
                        queue.add(new Node(nextCost, nextStep));
                    }
                }
            }
        }

        System.out.println(maxPrice[N]);
        System.out.println("solving count: " + cntSolving);
    }

    static class Node {
        int cost;
        int step;

        public Node(int cost, int step) {
            this.cost = cost;
            this.step = step;
        }

        public int getCost() {
            return cost;
        }

        public int getStep() {
            return step;
        }
    }

}
