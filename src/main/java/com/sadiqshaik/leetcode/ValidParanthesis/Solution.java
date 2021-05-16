package com.sadiqshaik.leetcode.ValidParanthesis;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stringValue = new Stack<>();

        if(s.length() % 2 != 0)
            return false;
        for (char ch: s.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                stringValue.push(ch);
            } else {
                if(s.isEmpty())
                    return false;
                else {
                    Character character = stringValue.peek();
                    if(ch == '}' && character == '{' ||
                            ch == ')' && character == '(' ||
                            ch == ']' && character == '[') {
                        stringValue.pop();
                    } else
                        return stringValue.size() == 0;
                }
            }
        }
        return stringValue.size() == 0;
    }
}