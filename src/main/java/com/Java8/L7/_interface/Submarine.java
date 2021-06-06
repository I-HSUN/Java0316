package com.Java8.L7._interface;

public class Submarine implements Swimmeer{
    private String name;

    public Submarine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
   
    @Override
    public void swim() {
        System.out.printf("淺水挺 %s 潛行 %n",name);
    }
    
}
