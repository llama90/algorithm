package stackandqueue;

import org.junit.Assert;
import org.junit.Test;

public class BalancedBracketsTest {

    @Test
    public void example01() {
        Assert.assertEquals("YES", BalancedBrackets.isBalanced("{[()]}"));
    }

    @Test
    public void example02() {
        Assert.assertEquals("NO", BalancedBrackets.isBalanced("{[(])}"));
    }

    @Test
    public void example03() {
        Assert.assertEquals("YES", BalancedBrackets.isBalanced("{{[[(())]]}}"));
    }

    @Test
    public void customExample01() {
        Assert.assertEquals("NO", BalancedBrackets.isBalanced("{{{{{"));
    }

    @Test
    public void customExample02() {
        Assert.assertEquals("NO", BalancedBrackets.isBalanced("}}}}}"));
    }

}
