package com.ocp.day26;

//分組

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGroupingByDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("banana");
        names.add("apple");
        names.add("apple");
        names.add("orange");
        names.add("papaya");
        names.add("banana");
        System.out.println(
                names.stream()
                    .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
        );
        System.out.println(
                names.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        );
        Map<String,Long> result = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
     
    }
    
}
