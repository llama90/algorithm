package warmup;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {

    @Test
    public void example01() {
        Assert.assertEquals(2, CountingValleys.countingValleys(12, "DDUUDDUDUUUD"));
    }

    @Test
    public void example02() {
        Assert.assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
    }

}
