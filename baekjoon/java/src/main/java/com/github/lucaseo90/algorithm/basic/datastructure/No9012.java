package com.github.lucaseo90.algorithm.basic.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class No9012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            Stack<Character> stack = new Stack<Character>();
            boolean isVPS = true;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == '(') {
                    stack.push(line.charAt(j));
                }

                if (line.charAt(j) == ')') {
                    if (!stack.isEmpty()) {
                        char parenthesis = stack.pop();
                        if (parenthesis == ')') {
                            isVPS = false;
                        }
                    } else {
                        isVPS = false;
                    }
                }

                if (!isVPS) {
                    break;
                }
            }
            if (isVPS && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
