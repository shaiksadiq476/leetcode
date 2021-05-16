package com.sadiqshaik.leetcode.RemoveDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> uniqueNumbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
        uniqueNumbers = new ArrayList<>(new HashSet<>(uniqueNumbers));

        return uniqueNumbers.toArray().length;
    }
}