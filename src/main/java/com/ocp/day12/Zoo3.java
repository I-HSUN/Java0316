package com.ocp.day12;

public class Zoo3 {
    public static void main(String[] args) {
        Cat cat= new Tiger();
        cat.shout();
        ((Tiger)cat).Hunter();
        Cat cat2 = new Cat();
        if (cat2 instanceof Tiger) {
            ((Tiger)cat2).Hunter();//轉型失敗            
        }else{
            System.out.println("cat2 不能轉 Tiger");
        }
    }
}
