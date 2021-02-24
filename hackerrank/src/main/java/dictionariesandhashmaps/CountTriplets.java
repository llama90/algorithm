package dictionariesandhashmaps;

import java.util.ArrayList;
import java.util.List;

public class CountTriplets {
    private static ArrayList<Long> element = new ArrayList<>();
    private static int countTriplet = 0;

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        int size = arr.size();
        boolean[] visited = new boolean[size];

        countTriplet = 0;
        traverse(arr, visited, size, 3, 0, r, 0);
        return countTriplet;
    }

    static void traverse(List<Long> arr, boolean[] visited, int n, int r, int depth, long ratio, long ratioValue) {
        if (element.size() == r) {
            countTriplet++;
            return;
        }

        for (int i = depth; i < n; i++) {
            if (!visited[i]) {
                if (ratioValue == 0 || arr.get(i) == ratioValue) {
                    visited[i] = true;
                    element.add(arr.get(i));
                    traverse(arr, visited, n, r, i, ratio, arr.get(i) * ratio);
                    element.remove(element.size() - 1);
                    visited[i] = false;
                }
            }
        }
    }

}
