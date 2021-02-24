package sorting;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void example01() {
        Assert.assertEquals("[Array is sorted in 0 swaps., First Element: 1, Last Element: 3]", BubbleSort.countSwaps(new int[]{1, 2, 3}).toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals("[Array is sorted in 3 swaps., First Element: 1, Last Element: 3]", BubbleSort.countSwaps(new int[]{3, 2, 1}).toString());
    }

}
