package com.github.lucaseo90.algorithm.basic.datastructure;

import java.util.LinkedList;
import java.util.Scanner;

public class No10845 {
    static int N;

    static String[] operations = {"push", "pop", "size", "empty", "front", "back"};
    static Queue queue = new Queue();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();

            if (line.contains(operations[0])) {
                String[] values = line.split(" ");
                int value = Integer.valueOf(values[1]);
                queue.push(value);
                continue;
            }

            if (line.equals(operations[1])) {
                System.out.println(queue.pop());
            } else if (line.equals(operations[2])) {
                System.out.println(queue.size());
            } else if (line.equals(operations[3])) {
                System.out.println(queue.empty());
            } else if (line.equals(operations[4])) {
                System.out.println(queue.front());
            } else if (line.equals(operations[5])) {
                System.out.println(queue.back());
            }
        }
    }

    public static class Queue {
        LinkedList<Integer> list;

        public Queue() {
            list = new LinkedList<Integer>();
        }

        public int push(Integer value) {
            list.add(value);
            return value;
        }

        public int pop() {
            if(list.isEmpty()) {
                return -1;
            }
            return list.removeFirst();
        }

        public int size() {
            return list.size();
        }

        public int empty() {
            if(list.isEmpty()) {
                return 1;
            }
            return 0;
        }

        public int front() {
            if(list.isEmpty()) {
                return -1;
            }
            return list.getFirst();
        }

        public int back() {
            if(list.isEmpty()) {
                return -1;
            }
            return list.getLast();
        }

    }

}
