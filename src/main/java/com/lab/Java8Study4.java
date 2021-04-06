package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Study4 {
    public static void main(String[] args) {
        int[] scores = {80, 70, 50, 40, 90};
        int sum = IntStream.of(scores).sum();
        double avg = IntStream.of(scores).average().getAsDouble();
        int max = IntStream.of(scores).max().getAsInt();
        int min = IntStream.of(scores).min().getAsInt();
        IntSummaryStatistics stat = IntStream.of(scores).summaryStatistics();
        System.out.printf("sum: %d, avg: %.1f, max: %d, min:%d\n ",
                stat.getSum(),stat.getAverage(),stat.getMax(),stat.getMin());

    }
    
}
