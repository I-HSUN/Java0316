package com.ocp.day02;

public class StudentCase {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 18, 170, 60);
        s1.print();
        //學生加入考試成績物件
        s1.exam = new Exam(s1.name, 90, 91);
        s1.print();
        //請單獨印出bmi資料
        System.out.println(s1.bmi.getBMIValue());
        //請單獨印出平均分數資料
        System.out.println(s1.exam.getAvg());
        //修改數學分數 = 75分
        s1.exam.math = 75;
        s1.print();
    }
   
}
