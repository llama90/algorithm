package com.github.lucaseo90.algo.day05.twopointer;

import com.github.lucaseo90.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class No0019Test {

    private No0019 no0019 = new No0019();

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

        Assert.assertEquals(expectedNode.val, no0019.removeNthFromEnd(node, 2).val);
    }
}
