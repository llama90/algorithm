package sort;

import brouteforce.FindPrimeNumber;
import org.junit.Assert;
import org.junit.Test;

public class FindPrimeNumberTest {

    public FindPrimeNumber findPrimeNumber = new FindPrimeNumber();

    @Test
    public void testExample01() {
        Assert.assertEquals(3, findPrimeNumber.solution("17"));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(2, findPrimeNumber.solution("011"));
    }

    @Test
    public void testCustomExample01() {
        Assert.assertEquals(5, findPrimeNumber.solution("017"));
    }
}
