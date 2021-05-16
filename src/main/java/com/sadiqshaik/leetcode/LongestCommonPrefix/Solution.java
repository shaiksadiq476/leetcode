package com.sadiqshaik.leetcode.LongestCommonPrefix;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<String> strings = Arrays.asList(strs);
        String commonString = "";

        Collections.sort(strings, Comparator.comparing(String::length));
        if(strings.isEmpty())
            return "";
        else if (strings.size() == 1)
            return strings.get(0);
        else {
            List<String> alps = Arrays.asList(strings.get(0).split(""));
            for(int i = 0; i < alps.size(); i++) {
                boolean flag = false;
                for (int j = 1; j < strings.size(); j++) {
                    if (!alps.get(i).equals(strings.get(j).split("")[i])) {
                        break;
                    } else
                        flag = true;
                }
                if(flag)
                    commonString += alps.get(i);
                else
                    break;
            }
        }
        return commonString;
    }
}