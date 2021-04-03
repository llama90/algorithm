package com.github.lucaseo90;

import java.util.LinkedList;
import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int max = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            int value = in.nextInt();
            list.add(value);
            if (max < value) {
                max = value;
            }
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += calcScore(list.get(i), max);
        }
        System.out.println(sum / N);
    }

    public static double calcScore(int n, int max) {
        return n / (double)max * 100;
    }
}
