package sorting;

import org.junit.Assert;
import org.junit.Test;

public class MarkAndToysTest {

    @Test
    public void example01() {
        Assert.assertEquals(4, MarkAndToys.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));
    }
}
