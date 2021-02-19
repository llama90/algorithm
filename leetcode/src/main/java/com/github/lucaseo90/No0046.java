package com.github.lucaseo90;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No0046 {
    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> elements = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        permutation(nums, visited, nums.length, nums.length, 0);
        return answer;
    }

    public void permutation(int[] nums, boolean[] visited, int n, int r, int depth) {
        if (elements.size() == r) {
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < r; i++) {
                list.add(elements.get(i));
            }
            answer.add(list);
            return;
        }

        for (int i = depth; i < n; i++) {
            if (!visited[i]) {
                elements.add(nums[i]);
                visited[i] = true;
                permutation(nums, visited, n, r, depth);
                visited[i] = false;
                elements.remove(elements.size() - 1);
            }
        }
    }
}
