package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LeftRotationTest {

    @Test
    public void example01() {

        Assert.assertEquals("[5, 1, 2, 3, 4]", Arrays.toString(LeftRotation.rotLeft(new int[]{1, 2, 3, 4, 5}, 4)));
    }

}
