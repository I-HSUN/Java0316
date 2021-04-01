package com.ocp.day06;

public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java cource");
        System.out.println("SB = " + sb);
        //刪除全部
        sb.delete(0, sb.length());//(0,11)從0開始直到某一個為度值
        System.out.println("SB = " + sb);                
    }
    
}
