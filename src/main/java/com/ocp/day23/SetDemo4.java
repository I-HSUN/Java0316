package com.ocp.day23;

import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

public class SetDemo4 {
    public static void main(String[] args) {
        Set <Integer>scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(200);
        scores.add(90);
        scores.add(-150);
        scores.add(80);
        System.out.println(scores);

        IntSummaryStatistics sum = scores
                .stream()
                .mapToInt(Integer::intValue)
                .filter(Score::isValid)
                .summaryStatistics();
        System.out.println(sum);
    }
}
