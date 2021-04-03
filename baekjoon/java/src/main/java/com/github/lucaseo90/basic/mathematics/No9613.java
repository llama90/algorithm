package com.github.lucaseo90.basic.mathematics;

import java.util.LinkedList;
import java.util.Scanner;

public class No9613 {

    static int testCase;
    static int N;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testCase = in.nextInt();

        for (int t = 0; t < testCase; t++) {
            N = in.nextInt();

            int[] numbers = new int[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                numbers[i] = in.nextInt();
            }

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    sum += greatestCommonDivisor(numbers[i], numbers[j]);
                }
            }

            System.out.println(sum);
        }
    }


    static int greatestCommonDivisor(int A, int B) {
        LinkedList<Integer> aliquots = findAliquot(A, B, false);
        int greatestCommonDivisor = 1;
        for (int i = 0; i < aliquots.size(); i++) {
            greatestCommonDivisor *= aliquots.get(i);
        }
        return greatestCommonDivisor;
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
