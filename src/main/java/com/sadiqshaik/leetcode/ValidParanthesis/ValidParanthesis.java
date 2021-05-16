package com.sadiqshaik.leetcode.ValidParanthesis;

/**
 * @author : sadiqshaik
 * @created : 5/2/21, Sunday
 **/
public class ValidParanthesis {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "()";
        System.out.println(solution.isValid(s));

        s = "()[]{}";
        System.out.println(solution.isValid(s));

        s = "()[]{";
        System.out.println(solution.isValid(s));

        s = "((";
        System.out.println(solution.isValid(s));
    }
}
