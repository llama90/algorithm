package com.github.lucaseo90;

import java.util.ArrayList;
import java.util.List;

public class No0060 {
    private String answer = "";
    private List<Integer> elements = new ArrayList<>();
    private int order = 0;
    private int count = 0;

    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }

        boolean[] visited = new boolean[n];
        order = k;
        permutation(nums, visited, n, n, 0);
        return answer;
    }

    public void permutation(int[] nums, boolean[] visited, int n, int r, int depth) {
        if (elements.size() == r) {
            count++;
            if (order == count) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < r; i++) {
                    sb.append(elements.get(i));
                }
                answer = sb.toString();
            }
            return;
        }

        for (int i = depth; i < n; i++) {
            if (!visited[i] && count < order) {
                elements.add(nums[i]);
                visited[i] = true;
                permutation(nums, visited, n, r, depth);
                visited[i] = false;
                elements.remove(elements.size() - 1);
            }
        }
    }

}
