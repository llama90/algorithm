package sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    // Complete the countSwaps function below.
    static List<String> countSwaps(int[] a) {
        List<String> answer = new ArrayList<>();
        int n = a.length;

        int countSwap = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    countSwap++;
                }
            }
        }

        answer.add("Array is sorted in " + countSwap + " swaps.");
        answer.add("First Element: " + a[0]);
        answer.add("Last Element: " + a[n - 1]);
        return answer;
    }
}
