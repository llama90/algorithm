package com.github.hsseo0501;

import java.util.Scanner;

public class No1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int cycle = 0;

        int newNumber = N;
        while (true) {
            int divided = newNumber / 10;
            int remained = newNumber % 10;

            int partialSum = divided + remained;
            if(partialSum >= 10) {
                partialSum -= 10;
            }

            newNumber = remained * 10 + partialSum;
            cycle++;
            if (newNumber == N) {
                System.out.println(cycle);
                break;
            }
        }
    }
}
