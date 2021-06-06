package com.Java8.L7._interface;

public class Human implements Swimmeer{
    
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
   
    @Override
    public void swim() {
        System.out.printf("人類 %s 游泳 %n",name);
    }
    
}


