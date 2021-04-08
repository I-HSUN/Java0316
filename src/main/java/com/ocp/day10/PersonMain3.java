package com.ocp.day10;

import java.util.DoubleSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain3 {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("John",  17, 170, 60.5),
            new Person("Mary",  18, 160, 50.5),
            new Person("Jo",    19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom",   21, 190, 120.5),
        };
        //計算bmi的平均最大最小part1
        DoubleSummaryStatistics stat =Stream.of(persons)
                .mapToDouble( p -> p.getWeight() / Math.pow(p.getHeight()/100, 2))
                .summaryStatistics();
        System.out.printf("平均: %.2f ,最大: %.2f , 最小: %.2f",
                stat.getAverage(),stat.getMax(),stat.getMin());
        //計算bmi的平均最大最小part2
        Function<Person,Double> getBMI = p -> p.getWeight() / Math.pow(p.getHeight()/100, 2);
        DoubleSummaryStatistics stat2 =Stream.of(persons)
                .mapToDouble(getBMI::apply)//p->getBMI.apply(p)
                .summaryStatistics();
        System.out.printf("平均: %.2f ,最大: %.2f , 最小: %.2f",
                stat2.getAverage(),stat2.getMax(),stat2.getMin());
    }
}
