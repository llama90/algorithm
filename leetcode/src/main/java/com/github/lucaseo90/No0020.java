package com.github.lucaseo90;

import java.util.Stack;

public class No0020 {
    public boolean isValid(String s) {
        boolean isValid = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (element == '{' || element == '(' || element == '[') {
                stack.push(s.charAt(i));
            } else { // '}', ')', ']'
                if(!stack.isEmpty()) {
                    if (element == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if (element == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if (element == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                } else {
                    isValid = false;
                    break;
                }
            }
        }

        if(!stack.isEmpty()) {
            isValid = false;
        }

        return isValid;
    }
}
