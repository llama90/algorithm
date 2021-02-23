package stackandqueue;

import java.util.Stack;

public class BalancedBrackets {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Boolean isBalanced = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (element == '}' || element == ')' || element == ']') {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                } else {
                    char peekElement = stack.peek();
                    if (element == '}' && peekElement == '{') {
                        stack.pop();
                    } else if (element == ')' && peekElement == '(') {
                        stack.pop();
                    } else if (element == ']' && peekElement == '[') {
                        stack.pop();
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
            } else {
                stack.push(element);
            }
        }

        if (stack.isEmpty() && isBalanced) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
