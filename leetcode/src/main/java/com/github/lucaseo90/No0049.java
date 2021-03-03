package com.github.lucaseo90;

import java.util.*;

public class No0049 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagram = new ArrayList<>();

        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);

            List<String> words;
            if (hashMap.containsKey(Arrays.toString(word))) {
                words = hashMap.get(Arrays.toString(word));
            } else {
                words = new ArrayList<>();
            }
            words.add(strs[i]);
            hashMap.put(Arrays.toString(word), words);
        }

        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
            groupAnagram.add(entry.getValue());
        }

        return groupAnagram;
    }
}
