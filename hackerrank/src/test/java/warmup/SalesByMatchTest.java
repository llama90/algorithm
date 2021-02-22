package warmup;

import org.junit.Assert;
import org.junit.Test;

public class SalesByMatchTest {

    @Test
    public void example01() {
        Assert.assertEquals(3, SalesByMatch.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

}
