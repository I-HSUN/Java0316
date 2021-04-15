package com.ocp.day12;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
       // cat.Hunter();//因為 cat 裡面沒有Hunter()
       Tiger tiger = new Tiger();
       tiger.shout();
       tiger.Hunter();
       Cat cat2 = new Tiger();
       //cat2.Hunter();//Cat裡面沒有 Hunter()
       cat2.shout();
    }
    
}
