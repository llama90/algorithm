package com.github.hsseo0501.swea;

import java.util.Scanner;

public class No14888 {

    static int N;
    static int[] numbers = new int[11];
    static int[] operation = new int[10];
    static boolean[] visited = new boolean[10];

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int idx = 0;

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            int countOperation = scanner.nextInt();
            for (int j = 0; j < countOperation; j++) {
                operation[idx++] = i + 1;
            }
        }

        dfs(0, 1, numbers[0], 0);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int v, int idx, int num, int len) {
        int result = 0;

        if (len == N - 1) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        } else {
            for (int i = 0; i < N - 1; i++) {
                if (!visited[i]) {
                    switch (operation[i]) {
                        case 1:
                            result = num + numbers[idx];
                            break;
                        case 2:
                            result = num - numbers[idx];
                            break;
                        case 3:
                            result = num * numbers[idx];
                            break;
                        case 4:
                            result = num / numbers[idx];
                            break;
                    }
                    visited[i] = true;
                    dfs(i, idx + 1, result, len + 1);
                }
            }
        }

        visited[v] = false;

    }

}
