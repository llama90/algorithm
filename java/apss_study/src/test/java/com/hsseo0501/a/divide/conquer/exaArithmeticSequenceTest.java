package com.hsseo0501.a.divide.conquer;

import org.junit.Assert;
import org.junit.Test;

public class exaArithmeticSequenceTest {

    private exaArithmeticSequence arithmeticSequence = new exaArithmeticSequence();

    @Test
    public void calculateRecursiveTest() {
        long start = System.currentTimeMillis();
        int n = arithmeticSequence.calculateRecursive(10000);
        long end = System.currentTimeMillis();
        System.out.println("Recursive: " + (end - start)/1000.0 + "sec.");
        Assert.assertEquals(n,50005000);

        start = System.currentTimeMillis();
        n = arithmeticSequence.calculateDivideConquer(10000);
        end = System.currentTimeMillis();
        System.out.println("Divide conquer: " + (end - start)/1000.0 + "sec.");
        Assert.assertEquals(n,50005000);
    }
}
