package com.github.lucaseo90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class No0039 {
    private List<List<Integer>> answer = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> element = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates, 0, 0, target, element);
        return answer;
    }

    public void combination(int[] candidates, int depth, int sum, int target, List<Integer> element) {
        if (sum == target) {
            answer.add(new ArrayList<>(element));
            return;
        }

        for (int i = depth; i < candidates.length; i++) {
            if (sum + candidates[i] <= target) {
                element.add(candidates[i]);
                combination(candidates, i, sum + candidates[i], target, element);
                element.remove(element.size() - 1);
            }
        }
    }
}
