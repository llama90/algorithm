package com.github.lucaseo90.interview.string;

import java.util.HashMap;

public class No0387_FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), 1);
            } else {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            }
        }

        int uniqueCharacterIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
                uniqueCharacterIndex = i;
                break;
            }

        }
        return uniqueCharacterIndex;

    }
}
