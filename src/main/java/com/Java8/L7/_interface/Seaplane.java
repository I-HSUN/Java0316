package com.Java8.L7._interface;

public class Seaplane extends Airplan implements Swimmeer,Flyerk{
 
    public Seaplane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.print("海上");
        super.fly();
    }
    @Override
    public void swim() {
        System.out.printf("海上飛機 %s 在飛 %n",name);
    }

    
}
