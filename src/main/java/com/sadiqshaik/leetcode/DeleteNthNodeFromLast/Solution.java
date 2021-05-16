package com.sadiqshaik.leetcode.DeleteNthNodeFromLast;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        ListNode ref_head=head,temp_head=head;
        for(int i=0;i<n;ref_head=ref_head.next,i++);
        if(ref_head==null)
        {
            head = head.next;
            return head;
        }
        for(;ref_head.next!=null; ref_head = ref_head.next, temp_head = temp_head.next);
        temp_head.next=temp_head.next.next;
        return head;
    }

    ListNode head;

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

}
