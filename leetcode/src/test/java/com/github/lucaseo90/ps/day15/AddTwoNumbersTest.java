package com.github.lucaseo90.ps.day15;

import com.github.lucaseo90.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void example01() {
        ListNode answer = addTwoNumbers.addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3, null))),
                new ListNode(5, new ListNode(6, new ListNode(4, null)))
        );
        Assert.assertEquals("708", convertToString(answer));
    }

    @Test
    public void example02() {
        ListNode answer = addTwoNumbers.addTwoNumbers(
                new ListNode(9, new ListNode(9, new ListNode(9, null))),
                new ListNode(9, new ListNode(9))
        );
        Assert.assertEquals("8901", convertToString(answer));
    }

    private String convertToString(ListNode answer) {
        StringBuilder sb = new StringBuilder();
        while (answer != null) {
            sb.append(answer.val);
            answer = answer.next;
        }
        return sb.toString();
    }

}
