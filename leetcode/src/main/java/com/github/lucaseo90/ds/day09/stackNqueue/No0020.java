package com.github.lucaseo90.ds.day09.stackNqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class No0020 {

    private Map<Character, Character> bracketPair = new HashMap<Character, Character>() {{
        put('(', ')');
        put('{', '}');
        put('[', ']');
    }};

    public boolean isValid(String s) {
        boolean isValid = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (element == '{' || element == '(' || element == '[') {
                stack.push(s.charAt(i));
            } else { // '}', ')', ']'
                if (!stack.isEmpty()) {
                    if (bracketPair.get(stack.peek()) == element) {
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

        if (!stack.isEmpty()) {
            isValid = false;
        }

        return isValid;
    }
}
