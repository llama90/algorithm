package com.github.lucaseo90.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1463 {

    public static int X;
    public static Queue<Value> queue = new LinkedList<Value>();
    public static int minimumCount = Integer.MAX_VALUE;
    public static int[] cache = new int[1000001];

    public static int calcCount = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        Arrays.fill(cache, Integer.MAX_VALUE);
        queue.add(new Value(1, 0));
        bfs();
        queue.clear();

        System.out.println(minimumCount);
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            Value value = queue.poll();
            int number = value.getNumber();
            int count = value.getCount();

            if (number == X) {
                calcCount++;
                if (minimumCount > count) {
                    minimumCount = count;
                }
            } else {
                if (number * 2 <= X && cache[number * 2] > count + 1) {
                    cache[number * 2] = count + 1;
                    queue.add(new Value(number * 2, count + 1));
                }
                if (number * 3 <= X && cache[number * 3] > count + 1) {
                    cache[number * 3] = count + 1;
                    queue.add(new Value(number * 3, count + 1));
                }
                if (number + 1 <= X && cache[number + 1] > count + 1) {
                    cache[number + 1] = count + 1;
                    queue.add(new Value(number + 1, count + 1));
                }
            }
        }
    }

//    public static void bfs() {
//        while (!queue.isEmpty()) {
//            Value value = queue.poll();
//            int number = value.getNumber();
//            int count = value.getCount();
//
//            if (number == 1) {
//                cache[number] = count;
//                calcCount++;
//                if (minimumCount > count) {
//                    minimumCount = count;
//                }
//            } else {
//                if (number % 2 == 0 && cache[number / 2] == 0) {
//                    queue.add(new Value(number / 2, count + 1));
//                }
//                if (number % 3 == 0 && cache[number / 3] == 0) {
//                    queue.add(new Value(number / 3, count + 1));
//                }
//                if (cache[number - 1] == 0) {
//                    queue.add(new Value(number - 1, count + 1));
//                }
//            }
//        }
//    }

    private static class Value {
        int number;
        int count;

        public Value(int number, int count) {
            this.number = number;
            this.count = count;
        }

        public int getNumber() {
            return number;
        }

        public int getCount() {
            return count;
        }
    }

}
