package com.github.lucaseo90.algorithm.basic.datastructure;

import java.util.Scanner;

public class No10808 {

    static int ASCII_OFFSET = 97;
    static int[] Alphabet = new int[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        for (int i = 0; i < line.length(); i++) {
            Alphabet[line.charAt(i) - ASCII_OFFSET]++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(Alphabet[i] + " ");
        }
        System.out.println();
    }
}
