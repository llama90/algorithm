package com.github.lucaseo90;

import java.util.LinkedList;
import java.util.List;

public class No0077 {
    private List<List<Integer>> combinations = new LinkedList<>();
    private List<Integer> candidate = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        findCombination(new boolean[n], n, k);
        return combinations;
    }

    public void findCombination(boolean[] picked, int n, int k) {
        if (candidate.size() == k) {
            combinations.add(new LinkedList<>(candidate));
            return;
        }

        for (int i = 1; i <= n; i++) {
            int index = i - 1;
            if (!picked[index]) {
                picked[index] = true;
                candidate.add(i);
                findCombination(picked, i, k);
                candidate.remove(candidate.size() - 1);
                picked[index] = false;
            }
        }
    }
}
