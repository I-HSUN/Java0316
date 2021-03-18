package com.ocp.day02;

public class StudentCase {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 18, 170, 60);
        s1.print();
        
        s1.exam = new Exam("小明", 90, 81);
        s1.print();
        //請單獨印出bmivalue
        System.out.println(s1.bmi.getBMIValue());
        //單獨印出成績資料
        System.out.println(s1.exam.getPrintData());
        //修改數學分數=75分
        s1.exam.math = 75;
        s1.print();
        
        
        
        System.out.println(s1.StudenPrint());
    }
    
}
