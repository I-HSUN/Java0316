package com.lab;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Study5 {
    public static void main(String[] args) {
        String[] scores = {"80", "70", "50", "40", "90"};
        int sum = 0;
        int max = 0;
        int min = 0;
        for (String score : scores) {
            if (Integer.parseInt(score)>=60) {
                sum += Integer.parseInt(score);
            }
            if (Integer.parseInt(score) > max) {
                max = Integer.parseInt(score);
            }
            
            if (max < min) {
                min=max;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        IntSummaryStatistics stat = Stream.of(scores)
                .mapToInt(s -> Integer.parseInt(s))
                .filter(s ->s>=60)
                .summaryStatistics();
        System.out.println(stat);
        
       
    }
    
}
