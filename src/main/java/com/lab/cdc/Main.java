package com.lab.cdc;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception{
        CDC[] cdcs = Util.getCdcs();
        Stream.of(cdcs)
                .filter(c-> c.getSent().contains("2021-05-13"))
                .filter(c->c.getHeadline().contains("新型冠狀病毒"))
                .peek(c->c.setDistance(Util.distance(c.getCircle(), "24,121")/1000))
                .forEach(c->{
                    System.out.print(c.getHeadline());
                    System.out.print(c.getDescription().trim());
                    System.out.print(c.getDistance());
                });
    }
    
}
