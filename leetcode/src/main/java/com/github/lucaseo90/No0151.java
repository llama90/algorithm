package com.github.lucaseo90;

public class No0151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                if (i == 0 || (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')) {
                    int j = i;
                    while (j < s.length() && s.charAt(j) != ' ') {
                        sb.append(s.charAt(j++));
                    }
                    sb.append(" ");
                }
            }
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.toString();
    }
}
