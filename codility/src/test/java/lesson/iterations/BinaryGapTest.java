package lesson.iterations;

import org.junit.Assert;
import org.junit.Test;

public class BinaryGapTest {

    @Test
    public void solutionTest() {
        BinaryGap binaryGap = new BinaryGap();
        Assert.assertEquals(2, binaryGap.solution(9));
        Assert.assertEquals(4, binaryGap.solution(529));
        Assert.assertEquals(1, binaryGap.solution(20));
        Assert.assertEquals(0, binaryGap.solution(15));
        Assert.assertEquals(0, binaryGap.solution(32));
    }

}
