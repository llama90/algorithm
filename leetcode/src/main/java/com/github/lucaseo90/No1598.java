package com.github.lucaseo90;

import java.util.Stack;

public class No1598 {
    public static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String element : logs) {
            if (element.equals("./")) {
                continue;
            }

            if (element.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(element);
            }
        }
        return stack.size();
    }
}
