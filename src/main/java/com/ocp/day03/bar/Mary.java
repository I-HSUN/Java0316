package com.ocp.day03.bar;

public class Mary {
    public void print(){
        John john = new John();
        System.out.print("Mary: ");
        System.out.print(john.a + ", ");
        System.out.print(john.b + ", ");
        System.out.print(john.c + "\n");
//        System.out.print(john.d + "\n");//因為john.d權限是private
    }    
}
