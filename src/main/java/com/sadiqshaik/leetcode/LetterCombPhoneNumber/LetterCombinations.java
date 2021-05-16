package com.sadiqshaik.leetcode.LetterCombPhoneNumber;

/**
 * @author : sadiqshaik
 * @created : 5/2/21, Sunday
 **/
public class LetterCombinations {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String digits = "23";
        System.out.println(solution.letterCombinations(digits));

        digits = "2";
        System.out.println(solution.letterCombinations(digits));

        digits = "";
        System.out.println(solution.letterCombinations(digits));
    }
}
