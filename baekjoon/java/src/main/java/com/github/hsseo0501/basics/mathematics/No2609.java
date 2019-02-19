package com.github.hsseo0501.basics.mathematics;

import java.util.LinkedList;
import java.util.Scanner;

public class No2609 {

    static int A, B;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();

        System.out.println(greatestCommonDivisor(A, B));
        System.out.println(findLeastCommonMultiple(A, B));
    }

    static int greatestCommonDivisor(int A, int B) {
        LinkedList<Integer> aliquots = findAliquot(A, B, false);
        int greatestCommonDivisor = 1;
        for (int i = 0; i < aliquots.size(); i++) {
            greatestCommonDivisor *= aliquots.get(i);
        }
        return greatestCommonDivisor;
    }

    static int findLeastCommonMultiple(int A, int B) {
        LinkedList<Integer> aliquots = findAliquot(A, B, true);
        int leastCommonMultiple;
        if (aliquots.size() == 0) {
            leastCommonMultiple = A * B;
        } else {
            int index = 0;
            int max = aliquots.get(index);
            while (true) {
                index++;
                if (max % A == 0 && max % B == 0) {
                    leastCommonMultiple = max;
                    break;
                }
                max *= aliquots.get(index);
            }
        }

        return leastCommonMultiple;
    }

    static LinkedList<Integer> findAliquot(int A, int B, boolean forLeastCommonMultiple) {
        LinkedList<Integer> aliquots = new LinkedList<Integer>();

        int number = 2;
        while (true) {
            if (A < number && B < number) {
                if (forLeastCommonMultiple) {
                    if (A != 1) {
                        aliquots.add(A);
                    }
                    if (B != 1) {
                        aliquots.add(B);
                    }
                }
                break;
            }

            if (A % number == 0 && B % number == 0) {
                aliquots.add(number);
                A = A / number;
                B = B / number;
                number = 2;
            } else {
                number++;
            }
        }

        return aliquots;
    }
}
