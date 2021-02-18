package com.github.lucaseo90;

public class No0387 {
    public int firstUniqChar(String s) {
        int index = -1;

        for (int i = 0; i < s.length(); i++) {
            char source = s.charAt(i);
            boolean isRepeat = false;
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                char target = s.charAt(j);
                if (source == target) {
                    isRepeat = true;
                    break;
                }
            }

            if (!isRepeat) {
                index = i;
                break;
            }

        }
        return index;
    }
}
