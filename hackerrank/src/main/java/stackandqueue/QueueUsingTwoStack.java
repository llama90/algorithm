package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStack {

    public static class MyQueue<T> {
        private Stack<T> stackA = new Stack<>();
        private Stack<T> stackB = new Stack<>();

        public void enqueue(T value) {
            stackA.push(value);
        }

        public T dequeue() {
            T value;
            if (stackB.isEmpty()) {
                while (!stackA.isEmpty()) {
                    stackB.push(stackA.pop());
                }
            }
            value = stackB.pop();

            return value;
        }

        public T peek() {
            T value;
            if (stackB.isEmpty()) {
                while (!stackA.isEmpty()) {
                    stackB.push(stackA.pop());
                }
            }
            value = stackB.peek();

            return value;
        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

}
