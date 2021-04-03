package com.github.lucaseo90;

import java.util.Scanner;

public class No1924 {
    static int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] dayOfWeek = {"SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        int numDay = 0;
        for (int i = 1; i < x; i++) {
            numDay += dayOfMonth[i - 1];
        }
        numDay += y + 1;
        int weekIdx = numDay % 7;
        System.out.println(dayOfWeek[weekIdx]);
    }
}
