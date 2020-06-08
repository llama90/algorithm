package com.github.hsseo0501;

import java.util.Scanner;

public class No1204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();

        for (int j = 0; j < T; j++) {
            int sequenceNumberOfTest = scan.nextInt();
            scan.nextLine();
            String numbers = scan.nextLine();
            String[] splitNumber = numbers.split(" ");
            int[] index = new int[101];
            int maximumCount = 0;
            for (int i = 0; i < splitNumber.length; i++) {
                int value = Integer.parseInt(splitNumber[i]);
                index[value]++;
                if (index[value] > maximumCount) {
                    maximumCount = index[value];
                }
            }

            for (int i = 100; i >= 0; i--) {
                if (index[i] == maximumCount) {
                    System.out.println("#" + sequenceNumberOfTest + "  " + i);
                    break;
                }
            }
        }
    }
}
