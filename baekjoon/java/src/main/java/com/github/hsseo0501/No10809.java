package com.github.hsseo0501;

import java.util.Arrays;
import java.util.Scanner;

public class No10809 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        int[] alphabetIndex = new int[26];
        int asciiOffset = 97;
        Arrays.fill(alphabetIndex, -1);
        for (int i = 0; i < line.length(); i++) {
            int value = line.charAt(i);
            if (alphabetIndex[value - asciiOffset] == -1) {
                alphabetIndex[value - asciiOffset] = i;
            }
        }

        for (int i = 0; i < alphabetIndex.length; i++) {
            System.out.print(alphabetIndex[i] + " ");
        }
        System.out.println();

    }
}
