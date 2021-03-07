package com.github.lucaseo90;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class No0451 {

    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (!frequencyMap.containsKey(element)) {
                frequencyMap.put(element, 1);
            } else {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            }
        }

        List<Map.Entry<Character, Integer>> entryList = new LinkedList<>(frequencyMap.entrySet());
        entryList.sort((o1, o2) -> {
            if (o1.getValue() > o2.getValue()) {
                return -1;
            } else if (o1.getValue().equals(o2.getValue())) {
                if (o1.getKey().compareTo(o2.getKey()) < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return 1;
        });

        for (Map.Entry<Character, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }

}
