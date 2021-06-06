package com.ocp.day28;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toSet;


public class NewClass {
    public static void main(String[] args) {
        List<String> items = Arrays.asList(
                "蘋果", 
                "蘋果", 
                "香蕉", 
                "蘋果",
                "柳丁",
                "香蕉",
                "椰子");
//        System.out.println(items);
        
        Map<Long ,Set<String>>reslut = items
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(Entry::getValue,Collectors.mapping(Entry::getKey, toSet())));
        System.out.println(reslut);
    }
    
}
  