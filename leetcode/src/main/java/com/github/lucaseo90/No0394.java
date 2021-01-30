package com.github.lucaseo90;

import java.util.Stack;

public class No0394 {

    public String decodeString(String s) {
        StringBuilder answer = new StringBuilder();

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String character1 = Character.toString(s.charAt(i));
            boolean isNumber1 = character1.matches("[+-]?\\d*(\\.\\d+)?");
            if (isNumber1) {
                StringBuilder number = new StringBuilder();
                for (; i < s.length(); i++) {
                    String subNumber = Character.toString(s.charAt(i));
                    number.append(subNumber);
                    if(s.charAt(i + 1) == '[') {
                        stack.push(number.toString());
                        i++;
                        break;
                    }
                }
                int rightSquareBracket = 0;
                int leftSquareBracket = 0;
                stack.push(Character.toString(s.charAt(i++)));  // add leftSquareBracket;
                leftSquareBracket++;


                while (leftSquareBracket != rightSquareBracket) {
                    if (s.charAt(i) == '[') {
                        leftSquareBracket++;
                    } else if (s.charAt(i) == ']') {
                        rightSquareBracket++;
                    }
                    String character2 = Character.toString(s.charAt(i));
                    boolean isNumber2 = character2.matches("[+-]?\\d*(\\.\\d+)?");
                    if(isNumber2) {
                        StringBuilder number2 = new StringBuilder();
                        for (; i < s.length(); i++) {
                            String subNumber = Character.toString(s.charAt(i));
                            number2.append(subNumber);
                            if(s.charAt(i + 1) == '[') {
                                stack.push(number2.toString());
                                i++;
                                break;
                            }
                        }
                    } else {
                        stack.push(character2);
                        i++;
                    }

                    if (leftSquareBracket == rightSquareBracket) {
                        i--;
                    }
                }

                rightSquareBracket = 0;
                leftSquareBracket = 0;
                StringBuilder subString = new StringBuilder();
                StringBuilder mulString = new StringBuilder();
                while (!stack.isEmpty()) {
                    String pop = stack.pop();
                    if (pop.equals("[") || pop.equals("]")) {
                        if (pop.equals('[')) {
                            rightSquareBracket++;
                        } else {
                            leftSquareBracket++;
                        }
                        continue;
                    }

                    boolean isNumber2 = pop.matches("[+-]?\\d*(\\.\\d+)?");
                    if (isNumber2) {
                        int length = Integer.parseInt(pop);
                        for (int j = 0; j < length; j++) {
                            mulString.append(subString);
                        }
                        subString = mulString;
                        mulString = new StringBuilder();
                    } else {
                        subString.insert(0, pop);
                    }
                }
                answer.append(subString);
            } else {
                answer.append(character1);
            }
        }
        return answer.toString();
    }
}
