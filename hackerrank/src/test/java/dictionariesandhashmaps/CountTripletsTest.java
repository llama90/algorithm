package dictionariesandhashmaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CountTripletsTest {

    @Test
    public void example01() {
        Assert.assertEquals(2, CountTriplets.countTriplets(Arrays.asList(1L, 2L, 2L, 4L), 2));
    }

    @Test
    public void example02() {
        Assert.assertEquals(6, CountTriplets.countTriplets(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L), 3));
    }

    @Test
    public void example03() {
        Assert.assertEquals(4, CountTriplets.countTriplets(Arrays.asList(1L, 5L, 5L, 25L, 125L), 5));
    }

}
