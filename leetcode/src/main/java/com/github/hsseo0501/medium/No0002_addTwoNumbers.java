package com.github.hsseo0501.medium;

import com.github.hsseo0501.medium.No0002.ListNode;

public class No0002_addTwoNumbers {

    /**
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
     * order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     * Example:
     *  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     *  Output: 7 -> 0 -> 8
     *  Explanation: 342 + 465 = 807.
     */

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        ListNode nextNode = l1;
        while(nextNode != null) {
            sb1.append(nextNode.val);
            nextNode = nextNode.next;
        }

        nextNode = l2;
        while(nextNode != null) {
            sb2.append(nextNode.val);
            nextNode = nextNode.next;
        }

        int a = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
        System.out.println(a);

        ListNode ret = null;
        while(a >= 0) {
            ListNode insertedNode = new ListNode(a % 10);
            insertedNode.next = null;
            if(ret == null) {
                ret = insertedNode;
            } else {
                ListNode tail = ret;
                while(tail.next != null) {
                    tail = tail.next;
                }
                tail.next = insertedNode;
            }
            a /= 10;
            if(a == 0) {
                break;
            }
        }

        return ret;
    }
}
