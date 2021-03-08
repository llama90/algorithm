package com.github.lucaseo90;

import java.util.*;

public class No0090 {
    private Set<List<Integer>> candidate = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        boolean[] visited = new boolean[nums.length];
        candidate.clear();
        candidate.add(new LinkedList<>());
        for (int i = 1; i <= nums.length; i++) {
            combination(nums, visited, i, 0, new ArrayList<>());
        }

        List<List<Integer>> list = new LinkedList<>(candidate);
        return list;
    }

    public void combination(int[] nums, boolean[] visited, int n, int depth, List<Integer> combination) {
        if (combination.size() == n) {
            candidate.add(new LinkedList<>(combination));
            return;
        }

        for (int i = depth; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination.add(nums[i]);
                combination(nums, visited, n, i, combination);
                combination.remove(combination.size() - 1);
                visited[i] = false;
            }
        }
    }
}
