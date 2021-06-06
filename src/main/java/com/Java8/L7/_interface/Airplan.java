package com.Java8.L7._interface;

public class Airplan implements Flyer{
    protected String name;

    public Airplan(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.printf("飛機 %s在飛 %n",name);
    }
    
}
