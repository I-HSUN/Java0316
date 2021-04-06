package com.lab;

import java.util.stream.Stream;

public class Java8Study7 {
    public static void main(String[] args) {
        String[][] names= {{"Jo","Mary"},{"Jhon","Helen"},{"Bob"}};
        int sum = Stream.of(names)
                .flatMap(s->Stream.of(s))
                .mapToInt(s->s.length())
                .sum();
        System.out.println(sum);
    }
    
}
