package com.github.lucaseo90;

import java.util.LinkedList;
import java.util.List;

public class No1395 {
    private List<Integer> candidate = new LinkedList<>();
    private int countTeams = 0;

    public int numTeams(int[] rating) {
        int size = rating.length;
        boolean[] picked = new boolean[size];
        countTeams = 0;
        findTeamsForward(rating, picked, size, 3, 0, 0);
        findTeamsBackward(rating, picked, size, 3, 0, Integer.MAX_VALUE);
        return countTeams;
    }

    public void findTeamsForward(int[] rating, boolean[] picked, int n, int r, int depth, int prevValue) {
        if (candidate.size() == r) {
            countTeams++;
            return;
        }

        for (int i = depth; i < n; i++) {
            if (!picked[i] && prevValue < rating[i]) {
                picked[i] = true;
                candidate.add(rating[i]);
                findTeamsForward(rating, picked, n, r, i, rating[i]);
                candidate.remove(candidate.size() - 1);
                picked[i] = false;
            }
        }
    }

    public void findTeamsBackward(int[] rating, boolean[] picked, int n, int r, int depth, int prevValue) {
        if (candidate.size() == r) {
            countTeams++;
            return;
        }

        for (int i = depth; i < n; i++) {
            if (!picked[i] && prevValue > rating[i]) {
                picked[i] = true;
                candidate.add(rating[i]);
                findTeamsBackward(rating, picked, n, r, i, rating[i]);
                candidate.remove(candidate.size() - 1);
                picked[i] = false;
            }
        }
    }
}
