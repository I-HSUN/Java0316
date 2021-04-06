package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Study3 {
    public static void main(String[] args) {
        int[] scores = {80, 70, 50, 40, 90};
        //算出平均
        int sum1=0;
        double avg= 0;
        for (int score : scores) {
            sum1 +=score;
        }
        avg=(double)sum1/scores.length;
        System.out.println("sum" + sum1);
        System.out.println("avg" + avg);
        int sum2 = IntStream.of(scores).sum();
        double avg2 = IntStream.of(scores).average().getAsDouble();
        System.out.println(sum2);
        System.out.println(avg2);
    }
    
}
