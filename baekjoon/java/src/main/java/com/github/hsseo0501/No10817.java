package com.github.hsseo0501;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class No10817 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> input = new LinkedList<Integer>();
        for (int i = 0; i < 3; i++) {
            input.add(in.nextInt());
        }
        Collections.sort(input);
        System.out.println(input.get(1));
    }
}
