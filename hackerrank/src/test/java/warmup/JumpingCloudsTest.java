package warmup;

import org.junit.Assert;
import org.junit.Test;

public class JumpingCloudsTest {

    @Test
    public void example01() {
        Assert.assertEquals(4, JumpingClouds.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
    }
}
