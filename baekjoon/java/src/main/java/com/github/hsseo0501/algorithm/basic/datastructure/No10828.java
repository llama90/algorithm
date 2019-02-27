package com.github.hsseo0501.algorithm.basic.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class No10828 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < N; i++) {
            String command = in.nextLine();
            if (command.contains("push")) {
                String[] split = command.split(" ");
                stack.push(Integer.valueOf(split[1]));
            } else if (command.contains("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                    stack.pop();
                }
            } else if (command.contains("size")) {
                System.out.println(stack.size());
            } else if (command.contains("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (command.contains("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }

    }
}
