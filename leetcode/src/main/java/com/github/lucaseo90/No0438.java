package com.github.lucaseo90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No0438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexes = new ArrayList<>();
        char[] charOfP = p.toCharArray();
        Arrays.sort(charOfP);

        int n = s.length();
        int m = p.length();
        for (int i = 0; i < n - m + 1; i++) {
            char[] charOfPartialS = new char[m];
            for (int j = 0; j < m; j++) {
                charOfPartialS[j] = s.charAt(i + j);
            }

            Arrays.sort(charOfPartialS);
            if (Arrays.equals(charOfP, charOfPartialS)) {
                indexes.add(i);
            }
        }

        return indexes;
    }

}
