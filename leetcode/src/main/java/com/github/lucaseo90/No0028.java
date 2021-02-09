package com.github.lucaseo90;

public class No0028 {
    public int strStr(String haystack, String needle) {
        int answer = -1;

        if (needle.length() == 0) {
            answer = 0;
        } else if (haystack.length() == 0) {
            answer = -1;
        } else if (haystack.length() >= needle.length()) {
            char first = needle.charAt(0);
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) != first) {
                    continue;
                }

                int firstIndex = i;
                boolean isContained = true;
                if (haystack.length() - firstIndex < needle.length()) {
                    break;
                }
                for (int j = 0; j < needle.length(); j++) {
                    if (i + j >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                        isContained = false;
                    }
                }
                if (isContained) {
                    answer = firstIndex;
                    break;
                }
            }
        }

        return answer;
    }
}
