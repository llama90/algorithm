package com.github.lucaseo90;

import java.util.Stack;

public class No1209 {

    public String removeDuplicates(String s, int k) {
        Stack<Element> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(new Element(element, 1));
            } else {
                if (stack.peek().value == element) {
                    stack.peek().count++;
                } else {
                    stack.push(new Element(element, 1));
                }

                if (stack.peek().count == k) {
                    stack.pop();
                }
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            Element element = stack.pop();
            for (int i = 0; i < element.count; i++) {
                result.append(element.value);
            }
        }

        return result.reverse().toString();
    }

    public class Element {
        public char value;
        public int count;

        public Element(char value, int count) {
            this.value = value;
            this.count = count;
        }
    }

}
