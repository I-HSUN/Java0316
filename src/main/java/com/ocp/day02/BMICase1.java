package com.ocp.day02;

public class BMICase1 {
    public static void main(String[] args) {
        String name1 = "小明";
        double height = 170;
        double weight = 60;
        double bmi = weight / Math.pow(height/100,2);
        String result = (bmi >23)?"過重":(bmi >23)?"過輕":"正常";
        System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI:%.1f  結果: %s\n",name1,height,weight,bmi,result);
    }
    
}
