package com.github.lucaseo90.interview.string;

public class No0007_ReverseInteger {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            x = x * -1;
            sb.append("-");
        } else if (x == 0) {
            sb.append("0");
        }

        while (x > 0) {
            int remain = x % 10;
            x = x / 10;
            sb.append(remain);
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}
