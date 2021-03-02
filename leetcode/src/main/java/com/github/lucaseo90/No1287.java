package com.github.lucaseo90;

import java.util.HashMap;
import java.util.Map;

public class No1287 {
    private HashMap<Integer, Integer> countMap = new HashMap<>();

    public int findSpecialInteger(int[] arr) {
        int answer = -1;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (!countMap.containsKey(arr[i])) {
                countMap.put(arr[i], 1);
            } else {
                countMap.put(arr[i], countMap.get(arr[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > size * 0.25) {
                answer = entry.getKey();
            }
        }
        return answer;
    }
}
