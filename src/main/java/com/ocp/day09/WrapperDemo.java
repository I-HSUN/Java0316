package com.ocp.day09;

public class WrapperDemo {
    public static void main(String[] args) {
        //取得INT最大值
        int max = Integer.MAX_VALUE;
        System.out.printf("Int的最大值: %,d\n",max);
        int max2 = Integer.max(10, 20);
        System.out.printf("10 與 20的最大值: %,d\n",max2);
        String Chinese = "100";
        String english = "90";
        System.out.printf("總分: %s\n", Chinese+english);
        System.out.printf("總分: %s\n", Integer.parseInt(Chinese)+Integer.parseInt(english));
    }
    
}
