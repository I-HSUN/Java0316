package com.ocp.day02;

public class BMICase3 {
    public static void main(String[] args) {
        BMI b1 = new BMI( "小明" , 170, 60);
        BMI b2 = new BMI( "小英" , 160, 50);
        BMI b3 = new BMI();
        b3.name = "小華";
        b3.height = 165;
        b3.weight = 40;
        BMI b4 = new BMI();
        b3.name = "小南";
        b3.height = 175;
        b3.weight = 70;
        
        b1.print();
        b2.print();
        b3.print();
        b4.print();
    }
}
