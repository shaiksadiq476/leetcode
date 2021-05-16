package com.sadiqshaik.leetcode.LetterCombPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.equals(""))
            return new ArrayList<>();
        List<String> numbers = Arrays.asList(digits.split(""));
        List<String> resultList = new ArrayList<>();

        for(int i=0; i < numbers.size(); i++){
            if(i == 0)
                resultList = getList(Integer.parseInt(numbers.get(i)));
            else {
                List<String> toBeMappedList = getList(Integer.parseInt(numbers.get(i)));
                List<String> newResultList = new ArrayList<>();
                for(String each : resultList){
                    for(String innerEach :  toBeMappedList){
                        newResultList.add(each.concat(innerEach));
                    }
                }
                resultList = newResultList;
            }
        }
        return resultList;
    }

    List<String> getList(int number){
        List<String> list = null;
        switch(number){
            case 2 :
                list = new ArrayList<>(List.of("a","b","c"));
                break;
            case 3 :
                list = new ArrayList<>(List.of("d","e","f"));
                break;
            case 4 :
                list = new ArrayList<>(List.of("g","h","i"));
                break;
            case 5 :
                list = new ArrayList<>(List.of("j","k","l"));
                break;
            case 6 :
                list = new ArrayList<>(List.of("m","n","o"));
                break;
            case 7 :
                list = new ArrayList<>(List.of("p","q","r","s"));
                break;
            case 8 :
                list = new ArrayList<>(List.of("t","u","v"));
                break;
            case 9 :
                list = new ArrayList<>(List.of("w","x","y","z"));
                break;
            default:

        }
        return list;
    }
}