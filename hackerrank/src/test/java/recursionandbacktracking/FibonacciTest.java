package recursionandbacktracking;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void example() {
        Assert.assertEquals(0, Fibonacci.fibonacci(0));
        Assert.assertEquals(1, Fibonacci.fibonacci(1));
        Assert.assertEquals(1, Fibonacci.fibonacci(2));
        Assert.assertEquals(2, Fibonacci.fibonacci(3));
        Assert.assertEquals(3, Fibonacci.fibonacci(4));
        Assert.assertEquals(5, Fibonacci.fibonacci(5));
        Assert.assertEquals(8, Fibonacci.fibonacci(6));
    }

}
