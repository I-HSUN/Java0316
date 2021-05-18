package com.ocp.day26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapDemo {
    public static void main(String[] args) {
//        Map<String,Integer>exams = new HashMap<>();
        Map<String,Integer>exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("英文", 90);
        exams.put("數學", 100);
        System.out.println(exams);
        //取得考試科目
        Set<String> subjects = exams.keySet();
        System.out.println(exams.keySet());
        System.out.println("國文");
        Collection<Integer> scores = exams.values();
        System.out.println(scores);
        List<Integer> scores2 = new ArrayList<>();
        System.out.println(scores2);
    }
    
}
