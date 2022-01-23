package com.ocp.day04;

import com.ocp.day04.bar.Money;

public class AccessMoney {
    public static void main(String[] args) {
        Money m1 = new  Money();
        com.ocp.day04.foo.Money m2 = new com.ocp.day04.foo.Money();
        System.out.println(m1.amount +m2.amount);
    }
    
}
