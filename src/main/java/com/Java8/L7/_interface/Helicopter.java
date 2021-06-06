package com.Java8.L7._interface;

//直升機
public class Helicopter extends Airplan{

    public Helicopter(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.printf("飛機 %s 在飛 %n",name);
    }

}
