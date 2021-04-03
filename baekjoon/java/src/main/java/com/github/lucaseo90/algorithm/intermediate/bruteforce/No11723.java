package com.github.lucaseo90.algorithm.intermediate.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No11723 {

    static int N;
    static boolean[] exist = new boolean[21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        N = Integer.parseInt(line);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            line = br.readLine();
            String[] splits = line.split(" ");

            String operation = splits[0];
            Integer value = 0;
            if (!operation.equals("all") && !operation.equals("empty")) {
                value = Integer.parseInt(splits[1]);
            }

            if (operation.equals("add")) {
                exist[value] = true;
            } else if (operation.equals("remove")) {
                exist[value] = false;
            } else if (operation.equals("check")) {
                if (exist[value]) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            } else if (operation.equals("toggle")) {
                if (exist[value]) {
                    exist[value] = false;
                } else {
                    exist[value] = true;
                }
            } else if (operation.equals("all")) {
                Arrays.fill(exist, true);
            } else if (operation.equals("empty")) {
                Arrays.fill(exist, false);
            }
        }
        System.out.println(sb);
    }
}
