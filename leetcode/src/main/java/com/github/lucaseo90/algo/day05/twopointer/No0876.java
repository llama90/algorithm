package com.github.lucaseo90.algo.day05.twopointer;

import com.github.lucaseo90.ListNode;

public class No0876 {
    public ListNode middleNode(ListNode head) {
        int length = 1;
        ListNode node = head;
        while (node.next != null) {
            length += 1;
            node = node.next;
        }

        int point = (length / 2);
        node = head;
        for (int i = 0; i < point; i++) {
            node = node.next;
        }
        return node;
    }
}
