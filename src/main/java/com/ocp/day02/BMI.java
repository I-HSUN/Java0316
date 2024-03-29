package com.ocp.day02;

//設計計算BMI應該要有的資源與方法
public class BMI {
    String name;//姓名
    double height;//身高
    double weight;//體重
    
    //建構子設計區
    BMI() {
    }
    
    BMI(String n,double h,double w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }
    
    
    double getBMIValue(){//取得計算後的BMI資料
        double bmiValue = weight / Math.pow(height/ 100, 2);//計算
        return bmiValue;//回傳bmiValue(要回傳與方法簽章一樣的型別也就是double值)
    }
    //取得BMI的分析結果
    String getResultValue(){
        double bmiValue = getBMIValue();
        String resultValue = (bmiValue > 23) ? "過重": (bmiValue < 18) ? "過輕" : "標準";
        return resultValue;
    }
    
    //列印資料
    void print(){
        double bmiValue = getBMIValue();
        String resultValue = getResultValue();
        System.out.printf("姓名: %s 身高:%.1f 體重: %.1f BMI: %.2f 結果: %s \n",
                name,height,weight,bmiValue,resultValue);
    }
    
}
