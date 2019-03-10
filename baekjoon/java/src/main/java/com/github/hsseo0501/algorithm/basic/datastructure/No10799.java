package com.github.hsseo0501.algorithm.basic.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class No10799 {

    /**
     *  ')'가 나올 때 절단되는 쇠막대기 수를 어떻게 계산하는지가 관건
     *  ')'가 나올 때 스택에 쌓인 괄호의 경우는 '('인 경우와 ')'인 경우가 있음
     *  전자의 경우 레이저로 스택 내의 '(' 개수를 count
     *  후자의 경우 레이저로 잘리고 남은 쇠막대기로 1을 count
     */
    static Stack<Character> stack = new Stack<Character>();
    static String line;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        line = scanner.nextLine();

        int sumIronBar = 0;

        Character prevParentheses = '(';
        stack.push(prevParentheses);
        for (int i = 1; i < line.length(); i++) {
            Character currParentheses = line.charAt(i);

            if (currParentheses == '(') {
                stack.add(currParentheses);
            } else if (currParentheses == ')') {
                stack.pop();
                if (prevParentheses == ')') {
                    sumIronBar++;
                } else if (prevParentheses == '(') {
                    sumIronBar += stack.size();
                }
            }

            prevParentheses = currParentheses;
        }

        System.out.println(sumIronBar);
    }
}
