package com.github.hsseo0501.algorithm.basic.datastructure;

import java.util.LinkedList;
import java.util.Scanner;

public class No1406 {

    static String line;
    static int numCommand;
    static int cursor;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        line = scanner.nextLine();
        numCommand = scanner.nextInt();
        scanner.nextLine();

        cursor = line.length();

        LinkedList<Character> list = new LinkedList<Character>();
        for (int i = 0; i < line.length(); i++) {
            list.add(line.charAt(i));
        }

        for (int i = 0; i < numCommand; i++) {
            String command = scanner.nextLine();
            Character operator = command.charAt(0);

            switch (operator) {
                case 'L':
                    if (cursor != 0) {
                        cursor--;
                    }
                    break;
                case 'D':
                    cursor += 1;
                    if (list.size() < cursor) {
                        cursor = list.size();
                    }
                    break;
                case 'B':
                    if (cursor != 0) {
                        list.remove(cursor - 1);
                        cursor--;
                        if (cursor < 0) {
                            cursor = 0;
                        }
                    }
                    break;
                case 'P':
                    list.add(cursor, command.charAt(2));
                    cursor++;
                    if (list.size() < cursor) {
                        cursor = list.size();
                    }
                    break;
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}
