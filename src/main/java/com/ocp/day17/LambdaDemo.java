package com.ocp.day17;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        Stream.of(100,50,70,80,30)
                .peek(x -> System.out.println(x.getClass().getTypeName()))//Integer
                .forEach(x ->System.out.println(x));//Integer
        
        Stream.of(100,50,70,80,30)
                .filter(x -> x >=60)//Prdicate
                .forEach(System.out::println);//Consumer
        
        Stream.of("Mary","John","Bob","Helen")
                //.mapToInt(x -> x.length())//Function
                .mapToInt(String::length)
                .forEach(x ->System.out.println(x));//Consumer

    }
    
}
