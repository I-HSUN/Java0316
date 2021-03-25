package com.ocp.day06;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[]scores = new int [3];
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 90;
        int len = scores.length;
        System.out.println(len);//取得陣列長度
        //印出陣列元素個資料
        System.out.println(scores[0] +","+scores[1]+","+scores[2]);
        
        System.out.println(Arrays.toString(scores));//印出陣列資料
        //總分
        int sum = scores[0] + scores[1] + scores[2];
        //平均
        double avg = (double)sum / len;
        System.out.printf("總分:%d 平均: %.1f \n",sum,avg);
    }
    
}
