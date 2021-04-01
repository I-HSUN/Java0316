package com.ocp.day08;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
//        int[][] m = {{100,90,80},{70,60,50}};
        int[][] m = new int[][]{{100,90,80},{70,60,50}};
        System.out.println(m);
        System.out.println(m[0]);
        System.out.println(m[1]);
        int sum = 0;
        for (int[] is : m) {
            for (int i : is) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
