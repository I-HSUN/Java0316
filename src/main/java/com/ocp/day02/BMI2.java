package com.ocp.day02;

//設計計算BMI應該要有的資源與方法
public class BMI2 {
    //屬性定義區
    String name;//姓名
    double height;//身高
    double weight;//體重
    
    //建構設計區
    BMI2() {
    }
    
    BMI2(String n,double h,double w) {
        name = n;
        height = h;
        weight = w;
    }
    
    //方法實作區
    //取得計算後的BMI資料
    double getBMIValue(){
        double bmivalue =(weight / Math.pow(height/100,2));//計算
        return bmivalue;//回傳 bmivalue (要回傳與方法簽章一樣的型別)
    }
    //取得BMI的分析結果
    String getResultValue(){
        double bmivalue =getBMIValue();//直接取得bmi valuse 的計算結果
        String resultValuse = (bmivalue >23)?"過重":(bmivalue >23)?"過輕":"正常";
        return resultValuse;
    }
       
    //列印資料
    void print(){
        double bmivalue =getBMIValue();
        String resultValuse = getResultValue();
        System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI:%.1f  結果: %s\n",
                name,height,weight,bmivalue,resultValuse);        
    }
}
