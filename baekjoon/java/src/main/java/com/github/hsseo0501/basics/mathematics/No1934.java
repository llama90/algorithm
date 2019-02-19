package com.github.hsseo0501.basics.mathematics;

import java.util.LinkedList;
import java.util.Scanner;

public class No1934 {

    static int testCase;
    static int A;
    static int B;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testCase = in.nextInt();

        for (int t = 0; t < testCase; t++) {
            A = in.nextInt();
            B = in.nextInt();

            System.out.println(findLeastCommonMultiple(A, B));
        }
    }

    static int findLeastCommonMultiple(int A, int B) {
        LinkedList<Integer> aliquots = findAliquot(A, B);
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

    static LinkedList<Integer> findAliquot(int A, int B) {
        LinkedList<Integer> aliquots = new LinkedList<Integer>();

        int number = 2;
        while (true) {
            if (A < number && B < number) {
                if (A != 1) {
                    aliquots.add(A);
                }
                if (B != 1) {
                    aliquots.add(B);
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
