package com.github.lucaseo90.algorithm.basic.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No1406 {

    static String line;
    static int numCommand;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        line = br.readLine();
        numCommand = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<Character>();
        Stack<Character> rightStack = new Stack<Character>();

        for (int i = 0; i < line.length(); i++) {
            leftStack.push(line.charAt(i));
        }

        for (int i = 0; i < numCommand; i++) {
            String command = br.readLine();
            Character operator = command.charAt(0);

            switch (operator) {
                case 'L':
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case 'D':
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case 'B':
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                case 'P':
                    leftStack.push(command.charAt(2));
                    break;
            }

        }

        while (!leftStack.empty()) {
            rightStack.push(leftStack.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!rightStack.empty()) {
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
    }
}
