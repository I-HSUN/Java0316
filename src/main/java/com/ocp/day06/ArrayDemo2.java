package com.ocp.day06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[]scores = {50, 90, 90, 80, 70, 100, 40, 100, 75, 15};
        System.out.printf("%s, 長度: %d\n",Arrays.toString(scores),scores.length);
        int sum = 0;
        for (int score : scores) {
           sum += score;
        }
        double avg = (double)sum/scores.length;
        System.out.printf("總分:%d 平均: %.1f\n",sum,avg);
        //求最高分
        int max = 0;
        for (int score : scores) {
           if(score >max){
            max= score;
           }
        }
        System.out.printf("最高分:%d\n" , max);
        //最低分
        int min = max;
        for (int score : scores) {
           if(score <min){
            min= score;
           }
        }
        System.out.printf("最低分:%d\n" , min);
//        
    }
    
}
