package com.sadiqshaik.leetcode.LongestPalindrome;

class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1 || s.length() == 2)
            return String.valueOf(s.charAt(0));
        else if (s == null) {
            return "";
        } else {
            int a = 0;
            int b = 1;
            int c = 2;

            int increment = 1;
            for( ; a < s.length() - 2; ) {

            }
        }

        return null;
    }
}