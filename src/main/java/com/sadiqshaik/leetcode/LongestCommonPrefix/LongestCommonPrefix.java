package com.sadiqshaik.leetcode.LongestCommonPrefix;

/**
 * @author : sadiqshaik
 * @created : 5/2/21, Sunday
 **/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[] {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs));

        strs = new String[] {"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(strs));

        strs = new String[] {"cir","car"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
