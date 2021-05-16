package com.sadiqshaik.leetcode.DeleteNthNodeFromLast;

/**
 * @author : sadiqshaik
 * @created : 5/2/21, Sunday
 **/
public class DeleteNthNodeFromLast {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.ListNode listNode = new Solution.ListNode();
        solution.push(7);
        solution.push(1);
        solution.push(3);
        solution.push(2);
        solution.push(8);
        solution.removeNthFromEnd(listNode, 3);
    }
}
