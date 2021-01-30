package com.github.lucaseo90;

import java.util.Stack;

public class No0394 {

    public String decodeString(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if ('1' <= character && character <= '9') {
                int rightSquareBracket = 0;
                int leftSquareBracket = 0;
                stack.push(s.charAt(i++));  // add number
                stack.push(s.charAt(i++));  // add leftSquareBracket;
                leftSquareBracket++;

                while (leftSquareBracket != rightSquareBracket) {
                    if (s.charAt(i) == '[') {
                        leftSquareBracket++;
                    } else if (s.charAt(i) == ']') {
                        rightSquareBracket++;
                    }
                    stack.push(s.charAt(i++));

                    if (leftSquareBracket == rightSquareBracket) {
                        i--;
                    }
                }

                rightSquareBracket = 0;
                leftSquareBracket = 0;
                StringBuilder subString = new StringBuilder();
                StringBuilder mulString = new StringBuilder();
                while (!stack.isEmpty()) {
                    char pop = stack.pop();
                    if (pop == '[' || pop == ']') {
                        if(pop == '[') {
                            rightSquareBracket++;
                        } else {
                            leftSquareBracket++;
                        }
                        continue;
                    }

                    if ('1' <= pop && pop <= '9') {
                        int length = pop - '0';
                        for (int j = 0; j < length; j++) {
                            mulString.append(subString);
                        }
                        subString = mulString;
                        mulString = new StringBuilder();
                    } else {
                        subString.insert(0, pop);
                    }
                }
                stringBuilder.append(subString);
            } else {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}
