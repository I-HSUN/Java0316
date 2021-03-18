package com.ocp.day02;

public class Student {
    String name ;
    int age;
    BMI2 bmi;
    Exam exam;
    ///設計建構子
   
    Student(String name, int age,double height,double weight) {
        this.name = name;
        this.age = age;
        this.bmi = new BMI2(name, height, weight);
    //    this.exam = new Exam(name, chinese, math);
    }
    
    void print(){
            System.out.printf("姓名:%s 年齡:%d \n",name,age);
            bmi.print();
            if(exam == null){
                System.out.println("此學生無成績!!");
            }else{
            System.err.println(exam.getPrintData());
            }
     }
     String StudenPrint(){
     return String.format("姓名:%s 年齡:%d 身高: %.1f 體重: %.1f BMI:%.1f 結果: %s\n",
                            name,age,bmi.height,bmi.weight,bmi.getBMIValue(),bmi.getResultValue());
     }
}
