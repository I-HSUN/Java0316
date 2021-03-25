package com.ocp.day06;


/*
    身高：172、168、164、170、176(公分)
    體重：62、57、58、64、64(公斤)

 */
public class Arraycv {
    public static void main(String[] args) {
        double[] nums = {10,20,30};
        double sum = 0;
        for (double n : nums) {//for-each
            sum+=n;
        }
        System.out.printf("sum:%.1f\n",sum);
        //平均
        double avg = sum / nums.length;
        System.out.printf("avg: %.1f\n",avg);
        double sumofSqares = 0;
        
        for (double n : nums) {
            sumofSqares += Math.pow(n-avg, 2);
        }
        System.out.printf("sum of Sqares: %.1f\n",sumofSqares);
        double sd = Math.sqrt((1.0/nums.length) * sumofSqares);//開根號
        System.out.printf("SD : %.1f \n",sd);
        //變異係數
        double cv = sd/avg;
        System.out.printf("cv : %.1f \n",cv);
    }
}
