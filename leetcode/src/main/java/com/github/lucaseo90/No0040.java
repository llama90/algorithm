package com.github.lucaseo90;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No0040 {
    private Set<List<Integer>> answer = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] visited = new boolean[candidates.length];
        Arrays.sort(candidates);
        combination(candidates, visited, 0, 0, target, new ArrayList<Integer>());
        return new ArrayList<>(answer);
    }

    public void combination(int[] candidates, boolean[] visited, int depth, int sum, int target, List<Integer> candidate) {
        if (sum == target) {
            answer.add(new ArrayList<>(candidate));
            return;
        }

        for (int i = depth; i < candidates.length; i++) {
            if (!visited[i] && sum + candidates[i] <= target) {
                visited[i] = true;
                candidate.add(candidates[i]);
                combination(candidates, visited, i, sum + candidates[i], target, candidate);
                candidate.remove(candidate.size() - 1);
                visited[i] = false;
            }
        }
    }
}
