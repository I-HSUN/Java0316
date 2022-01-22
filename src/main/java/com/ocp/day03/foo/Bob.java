package com.ocp.day03.foo;

import com.ocp.day03.bar.John;

public class Bob {
    public void print(){
        John john = new John();
        System.out.print("Mary: ");
        System.out.print(john.a + "\n");
//        System.out.print(john.b + ", ");
//        System.out.print(john.c + "\n");
//        System.out.print(john.d + "\n");//因為john.d權限是private
    }    
}
