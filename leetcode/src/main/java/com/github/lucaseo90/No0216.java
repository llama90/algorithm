package com.github.lucaseo90;

import java.util.ArrayList;
import java.util.List;

public class No0216 {
    private List<List<Integer>> candidates = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean[] visited = new boolean[arr.length];
        combination(arr, visited, arr.length, k, 0, new ArrayList<>(), n, 0);
        return candidates;
    }

    public void combination(int[] arr, boolean[] visited, int n, int r, int depth, ArrayList<Integer> candidate, int target, int currentSum) {
        if (candidate.size() == r && currentSum == target) {
            candidates.add(new ArrayList<>(candidate));
        }

        for (int i = depth; i < n; i++) {
            if (!visited[i] && currentSum <= target) {
                visited[i] = true;
                candidate.add(arr[i]);
                combination(arr, visited, n, r, i, candidate, target, currentSum + arr[i]);
                candidate.remove(candidate.size() - 1);
                visited[i] = false;
            }
        }
    }


}
