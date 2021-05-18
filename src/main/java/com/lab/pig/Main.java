package com.lab.pig;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
//            Stream.of(Util.getPigs())
//                .filter(p -> p.getAddr().startsWith("桃園"))
//                .forEach(System.out::println);
            System.out.println(
                Stream.of(Util.getPigs())
                .filter(p -> p.getAddr().startsWith("桃園"))
                .count()
            );
    }

}
