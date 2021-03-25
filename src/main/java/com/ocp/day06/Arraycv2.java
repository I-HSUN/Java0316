package com.ocp.day06;


/*
    身高：172、168、164、170、176(公分)
    體重：62、57、58、64、64(公斤)

 */
public class Arraycv2 {
    public static void main(String[] args) {
        double[] nums = {10,20,30};
        System.out.printf("sum : %.1f\n",MyMath.sum(nums));
        System.out.printf("avg : %.1f\n",MyMath.avg(nums));
        System.out.printf("sd : %.1f\n",MyMath.sd(nums));
        System.out.printf("cv : %.1f\n",MyMath.cv(nums));
    }
}
