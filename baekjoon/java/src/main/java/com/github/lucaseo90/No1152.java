package com.github.lucaseo90;

import java.util.Scanner;

public class No1152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        String[] words = line.split(" ");
        int length = words.length;
        for(int i = 0;i < words.length;i ++) {
            if(words[i].equals("")) {
                length = length - 1;
            }
        }
        System.out.println(length);
    }
}
