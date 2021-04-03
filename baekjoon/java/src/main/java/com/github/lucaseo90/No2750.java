package com.github.lucaseo90;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class No2750 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }

        Collections.sort(list);
        for (int i = 0; i < N; i++) {
            System.out.println(list.get(i));
        }
    }
}
