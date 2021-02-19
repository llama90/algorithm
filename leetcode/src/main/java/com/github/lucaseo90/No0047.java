package com.github.lucaseo90;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No0047 {
    private List<List<Integer>> answer = new ArrayList<>();
    private List<Integer> element = new ArrayList<>();
    private Set<String> candidateSet = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        int size = nums.length;
        boolean[] visited = new boolean[size];
        permutation(nums, visited, size, size, 0);
        return answer;
    }

    private void permutation(int[] nums, boolean[] visited, int n, int r, int depth) {
        if (element.size() == r) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < r; i++) {
                list.add(element.get(i));
            }

            if (!candidateSet.contains(list.toString())) {
                candidateSet.add(list.toString());
                answer.add(list);
            }
            return;
        }

        for (int i = depth; i < n; i++) {
            if (!visited[i]) {
                element.add(nums[i]);
                visited[i] = true;
                permutation(nums, visited, n, r, depth);
                visited[i] = false;
                element.remove(element.size() - 1);
            }
        }
    }

}
