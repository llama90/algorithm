package com.github.hsseo0501.algorithm.basic.sort;

import java.util.Arrays;
import java.util.Scanner;

public class No11650 {

    static int N;
    static Point[] list;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        list = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            list[i] = new Point(x, y);
        }

        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(list[i].toString() + "\n");
        }
        System.out.println(sb);
    }

    static class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point o) {
            if (this.x > o.x) {
                return 1;
            } else if (this.y > o.y) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return this.x + " " + this.y;
        }
    }

}
