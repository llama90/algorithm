package warmup;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {

    @Test
    public void example01() {
        Assert.assertEquals(7, RepeatedString.repeatedString("aba", 10));
    }

    @Test
    public void example02() {
        Assert.assertEquals(1000000000000L, RepeatedString.repeatedString("a", 1000000000000L));
    }

    @Test
    public void customExample01() {
        Assert.assertEquals(2, RepeatedString.repeatedString("abaaaaaaa", 3));
    }

    @Test
    public void customExample02() {
        Assert.assertEquals(10, RepeatedString.repeatedString("abcdabcdabcd", 40));
    }

}
