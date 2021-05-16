package com.sadiqshaik.leetcode.MergeSortedLists;


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null)
            return null;
        else if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;

        ListNode head;

        if(l1.val < l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
            System.out.println(head);
        } else {
            head = l2;
            head.next = mergeTwoLists(l2.next, l1);
            System.out.println(head);
        }
        return head;
    }
}