package warmup;

import java.util.Stack;

public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int countValley = 0;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < steps; i++) {
            char element = path.charAt(i);

            if (stack.isEmpty()) {
                stack.push(element);
            } else {
                if (stack.peek() == 'U' && element == 'D') {
                    stack.pop();
                } else if (stack.peek() == 'D' && element == 'U') {
                    stack.pop();
                    if (stack.isEmpty()) {
                        countValley++;
                    }
                } else {
                    stack.push(element);
                }
            }
        }
        return countValley;
    }
}
