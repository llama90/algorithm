package dfsbfs;

import org.junit.Assert;
import org.junit.Test;

public class TargetNumberTest {
    private TargetNumber targetNumber = new TargetNumber();

    @Test
    public void testExample01() {
        Assert.assertEquals(5, targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
