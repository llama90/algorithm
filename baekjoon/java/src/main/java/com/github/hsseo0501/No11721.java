package com.github.hsseo0501;

import java.util.Scanner;

public class No11721 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int loop = line.length() / 10;
        int remained = line.length() % 10;
        int period = loop * 10;
        for (int i = 0; i < period; i += 10) {
            System.out.println(line.substring(i, i + 10));
        }
        System.out.println(line.substring(period, period + remained));
    }
}
