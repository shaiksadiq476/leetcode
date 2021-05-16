package com.sadiqshaik.leetcode.RemoveDuplicates;

/**
 * @author : sadiqshaik
 * @created : 5/2/21, Sunday
 **/
public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(num));

        num = new int[]{1,1,2};
        System.out.println(solution.removeDuplicates(num));
    }
}
