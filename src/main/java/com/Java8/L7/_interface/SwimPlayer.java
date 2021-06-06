package com.Java8.L7._interface;

//游泳選手
public class SwimPlayer extends Human implements Swimmeer{
    private String name;

    
    public SwimPlayer(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.printf("游泳選手 %s 游泳 %n",name);
    }

}
