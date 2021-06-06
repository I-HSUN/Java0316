package com.Java8.L7._interface;

public class  FlyingFish extends Fish implements Flyerk{

    public FlyingFish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("飛魚游泳");
    }

    @Override
    public void fly() {
        System.out.println("飛漁會飛");
    }
}