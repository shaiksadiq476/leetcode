package com.sadiqshaik.leetcode.WaterContainer;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public int maxArea(int[] height) {
        List<Integer> heights = Arrays.stream(height).boxed().collect(Collectors.toList());
        Map<Integer, Integer> graphs = new LinkedHashMap<>();
        AtomicInteger i = new AtomicInteger();
        heights.forEach(each -> {
            graphs.put(i.get(), each);
            i.getAndIncrement();
        });

        graphs.forEach((eachKey, eachValue) -> System.out.println(eachKey.intValue() + " " + eachValue.intValue()));

        int area = 0;
        int variableArea;
        for(int key = 0; key < graphs.size(); key++){
            for(int innerKey = 1; innerKey < graphs.size(); innerKey++) {
                variableArea = (innerKey - key) * Math.min(graphs.get(key), graphs.get(innerKey));
                if(area < variableArea)
                    area = variableArea;
            }
        }
        //System.out.println(area);
        return area;
    }
}