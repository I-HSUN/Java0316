package com.ocp.day03.bar;

public class Mary {

    public void print() {
        John john = new John();
        System.out.print("Mary :");
        System.out.print(john.a +",");
        System.out.print(john.b +",");        
        System.out.println(john.c +",");
        //System.out.print(john.d +",");
    }
}
