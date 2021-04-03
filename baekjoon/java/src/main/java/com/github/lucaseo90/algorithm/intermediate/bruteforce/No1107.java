package com.github.lucaseo90.algorithm.intermediate.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class No1107 {

    static int goal;
    static int N;
    static boolean[] buttons = new boolean[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        goal = scanner.nextInt();
        N = scanner.nextInt();

        if(N != 0) {
            Arrays.fill(buttons, true);
            for (int i = 0; i < N; i++) {
                int button = scanner.nextInt();
                buttons[button] = false;
            }
        }

        int countButton = 0;
        StringBuilder sb = new StringBuilder();
        String goalString = String.valueOf(goal);
        if (goal != 100) {
            for (int i = 0; i < goalString.length(); i++) {
                int value = Integer.valueOf(goalString.charAt(i)) - 48;
                if (buttons[value]) {
                    countButton++;
                    sb.append(value);
                    continue;
                } else {
                    for (int j = 1; j <= 5; j++) {
                        int plusButton = (value + j) % 10;
                        int minusButton = value - j < 0 ? (value - j + 10) % 10 : value - j;
                        if (buttons[plusButton]) {
                            countButton++;
                            sb.append(plusButton);
                            break;
                        }
                        if (buttons[minusButton]) {
                            countButton++;
                            sb.append(minusButton);
                            break;
                        }
                    }
                }
            }
            int availableChannel = Integer.parseInt(sb.toString());
            countButton = countButton + Math.abs(availableChannel - goal);
        }
        System.out.println(countButton);

    }
}
