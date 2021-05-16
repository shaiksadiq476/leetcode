package com.sadiqshaik.leetcode.WaterContainer;

/**
 * @author : sadiqshaik
 * @created : 5/2/21, Sunday
 **/


public class WaterContainer {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] heights = new int[] {4,3,2,1,4};
        solution.maxArea(heights);

        heights = new int[] {1,8,6,2,5,4,8,3,7};
        solution.maxArea(heights);
    }
}

