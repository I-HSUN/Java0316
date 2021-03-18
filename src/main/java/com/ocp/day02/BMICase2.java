package com.ocp.day02;

public class BMICase2 {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.name = "小明";
        b1.height = 170;
        b1.weight = 60;
        
        BMI b2 = new BMI();
        b2.name = "小英";
        b2.height = 160;
        b2.weight = 50;
        
        BMI b3 = new BMI();
        b3.name = "小華";
        b3.height = 163;
        b3.weight = 53;

        BMI b4 = new BMI();
        b4.name = "小美";
        b4.height = 165;
        b4.weight = 54;
        
        b1.print();
        b2.print();
        b3.print();
        b4.print();
    }
    
}
