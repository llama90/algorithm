package dictionariesandhashmaps;

import org.junit.Assert;
import org.junit.Test;

public class TwoStringsTest {

    @Test
    public void example01() {
        Assert.assertEquals("YES", TwoStrings.twoStrings("hello", "world"));
    }

    @Test
    public void example02() {
        Assert.assertEquals("NO", TwoStrings.twoStrings("hi", "world"));
    }

}
