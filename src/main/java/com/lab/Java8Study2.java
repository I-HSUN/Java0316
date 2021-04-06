package com.lab;

import java.util.stream.IntStream;

public class Java8Study2 {
    public static void main(String[] args) {
        int[] scores = {80,70,50,40,90};
        //列印及格分數
        //Java 7
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>60) {
                System.out.println(scores[i]);
            }
        }
        //java8
        IntStream.of(scores)
                .filter(i -> i >=60)
                .forEach(s ->System.out.println(s));
    }
    
}
