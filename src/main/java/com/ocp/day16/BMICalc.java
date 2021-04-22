package com.ocp.day16;

public class BMICalc {
    public static void main(String[] args) {
        BMI bmi =(h, w) -> w/Math.pow(h/100, 2);
        System.out.println(bmi.getResult(170, 60));
    }
}
