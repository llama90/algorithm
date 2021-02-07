package com.github.lucaseo90;

public class No0007 {
    public int reverse(int x) {
        int number = removeRemainder(x);
        boolean isNegativeNumber = x < 0;

        StringBuilder sb = isNegativeNumber ? new StringBuilder("-") : new StringBuilder();

        int abs = Math.abs(number);
        do {
            sb.append(abs % 10);
            abs /= 10;
        } while (abs > 0);

        int answer;
        try {
            answer = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            answer = 0;
        }
        return answer;
    }

    private int removeRemainder(int n) {
        while (n % 10 == 0) {
            if (Math.abs(n) < 10) {
                break;
            }
            n /= 10;
        }
        return n;
    }
}
