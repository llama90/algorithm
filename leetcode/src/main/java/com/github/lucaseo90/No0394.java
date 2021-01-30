package com.github.lucaseo90;

import java.util.Stack;

public class No0394 {

    public String decodeString(String s) {
        StringBuilder answer = new StringBuilder();

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));

            if (!s1.equals("]")) {
                stack.push(s1);
            } else {
                StringBuilder string = new StringBuilder();
                String s2 = stack.pop();
                while (!s2.equals("[")) {
                    string.insert(0, s2);
                    s2 = stack.pop();
                }

                StringBuilder number = new StringBuilder();
                while (!stack.isEmpty() && stack.peek().matches("\\d")) {
                    number.insert(0, stack.pop());
                }

                int k = Integer.parseInt(String.valueOf(number));
                stack.push(repeat(string, k));
            }
        }

        while (!stack.isEmpty()) {
            answer.insert(0, stack.pop());
        }

        return answer.toString();
    }

    private String repeat(StringBuilder s, int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(s);
            n--;
        }
        return new String(sb);
    }

}
