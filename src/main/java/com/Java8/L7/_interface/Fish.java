package com.Java8.L7._interface;

public abstract class Fish implements Swimmeer{
    protected String name;
    public Fish(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public abstract void swim();
}

