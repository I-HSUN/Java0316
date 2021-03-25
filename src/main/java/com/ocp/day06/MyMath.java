package com.ocp.day06;

public class MyMath {
    public static double sum(double[] nums) {
        double sum = 0;
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }
    public static double avg(double[] nums) {
        double sum = sum(nums);
        double n = nums.length;
        double avg = sum/n;
        return avg;
    }
    public static double sd(double[] nums) {
        double avg = avg(nums);
        double sumofSqares = 0;
        
        for (double n : nums) {
            sumofSqares += Math.pow(n-avg, 2);
        }
        int n = nums.length;
        double sd = Math.sqrt((1.0/nums.length) * sumofSqares);//開根號
        return sd;
    }
    public static double cv(double[] nums) {
        double avg = avg(nums);
        double sd = sd(nums);
        double cv = sd/avg;
        return cv;
    }
}
