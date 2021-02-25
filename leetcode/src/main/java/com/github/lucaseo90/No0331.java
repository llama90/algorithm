package com.github.lucaseo90;

import java.util.Stack;

public class No0331 {
    public boolean isValidSerialization(String preorder) {
        String[] elements = preorder.split(",");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < elements.length; i++) {
            String element = elements[i];
            if (stack.isEmpty() || !element.equals("#")) {
                stack.push(element);
            } else {
                while (!stack.isEmpty() && stack.peek().equals("#")) {
                    stack.pop();
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
                stack.push("#");
            }
        }

        return stack.size() == 1 && stack.peek().equals("#");
    }

}
