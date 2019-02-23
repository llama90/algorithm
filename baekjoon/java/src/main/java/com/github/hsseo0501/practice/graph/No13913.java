package com.github.hsseo0501.practice.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No13913 {

    static int N;
    static int K;
    static boolean[] visited = new boolean[100001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();

        bfs();
    }

    static void bfs() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(N, new LinkedList<Integer>()));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int value = node.getValue();
            LinkedList<Integer> path = node.getPath();

            if (value == K) {
                System.out.println(path.size());
                for (int i = 0; i < path.size(); i++) {
                    System.out.print(path.get(i) + " ");
                }
                System.out.println();
                break;
            }

            if (value - 1 >= 0 && !visited[value - 1]) {
                path.add(value - 1);
                queue.add(new Node(value - 1, copyPath(path)));
                path.removeLast();
            }

            if (value + 1 <= 100000 && !visited[value + 1]) {
                path.add(value + 1);
                queue.add(new Node(value + 1, copyPath(path)));
                path.removeLast();
            }

            if (value * 2 <= 100000 && !visited[value * 2]) {
                path.add(value * 2);
                queue.add(new Node(value * 2, copyPath(path)));
                path.removeLast();
            }
        }

        queue.clear();
    }

    static LinkedList<Integer> copyPath(LinkedList<Integer> path) {
        LinkedList<Integer> temp = new LinkedList<Integer>();
        for (int i = 0; i < path.size(); i++) {
            temp.add(path.get(i));
        }
        return temp;
    }

    static class Node {
        int value;
        LinkedList<Integer> path;

        public Node(int value, LinkedList<Integer> path) {
            this.value = value;
            this.path = path;
        }

        public int getValue() {
            return value;
        }

        public LinkedList<Integer> getPath() {
            return path;
        }
    }
}
