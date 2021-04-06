package com.lab;

import java.util.stream.Stream;

public class Java8Study6 {
    public static void main(String[] args) {
        String[] names = {"banana","watermelon","apple","orange","mango"};
        
        int sum = Stream.of(names)
                //.mapToInt(s -> s.length())
                .mapToInt(String::length)//.mapToInt(s -> s.length())
                .filter( s -> s % 2 ==0)
                .sum();
        System.out.println(sum);
    }
}
