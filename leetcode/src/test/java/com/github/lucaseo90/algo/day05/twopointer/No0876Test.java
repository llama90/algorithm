package com.github.lucaseo90.algo.day05.twopointer;

import com.github.lucaseo90.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class No0876Test {

    private No0876 no0876 = new No0876();

    @Test
    public void example01() {
        ListNode node =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5, null)))));

        ListNode expectedNode =
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(5, null)));

        Assert.assertEquals(expectedNode.val, no0876.middleNode(node).val);
    }

    @Test
    public void example02() {
        ListNode node =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6, null))))));

        ListNode expectedNode =
                new ListNode(4,
                        new ListNode(5,
                                new ListNode(6, null)));

        Assert.assertEquals(expectedNode.val, no0876.middleNode(node).val);
    }
}
