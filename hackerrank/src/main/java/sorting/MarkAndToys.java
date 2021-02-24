package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MarkAndToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int size = prices.length;

        Arrays.sort(prices);
        int sumPrices = 0;
        int countToy = 0;
        for (int i = 0; i < size; i++) {
            if (sumPrices > k) {
                break;
            }
            sumPrices += prices[i];
            countToy++;
        }
        return countToy - 1;
    }
}
