package com.hsseo0501.a.divide.conquer;

public class exaArithmeticSequence {
    public int calculateRecursive(int n) {
        if (n < 0) {
            return 0;
        } else {
            return calculateRecursive(n - 1) + n;
        }

    }

    public int calculateDivideConquer(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 1) {
            return calculateDivideConquer(n - 1) + n;
        }
        return 2 * calculateDivideConquer(n / 2) + (n / 2) * (n / 2);
    }
}
