package com.github.lucaseo90.basic.bruteforce;

import java.util.Scanner;

public class No1476 {

    static int E, S, M;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        E = in.nextInt();
        S = in.nextInt();
        M = in.nextInt();

        int year = 1;
        int i = 1;
        int j = 1;
        int k = 1;
        while(true) {
            if(E == i && S  == j && M == k) {
                System.out.println(year);
                break;
            }

            year++;
            i++;
            j++;
            k++;
            if (i % 16 == 0) {
                i = 1;
            }

            if(j % 29 == 0) {
                j = 1;
            }

            if(k % 20 == 0) {
                k = 1;
            }

        }

    }
}
