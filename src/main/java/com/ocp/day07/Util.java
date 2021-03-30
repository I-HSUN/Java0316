package com.ocp.day07;

import java.util.Random;

public class Util {
    //取得int[]答案陣列
public static int []getAnsArray(){
    Random r = new Random();
    int [] ans ={0,0,0,0};
    for (int i = 0; i < 4; ) {
        int n = r.nextInt(9)+1;
        boolean exist = isExist(ans, n);
        if (!exist) {
            ans[i]=n;
            i++;
        }
    }
    return ans;
}
//判斷 n 值是否在ans[] int 陣列中
    public static boolean isExist(int []ans, int n) {
        for (int i = 0; i < ans.length; i++) {
            if (ans[i]==n) {
                return true;
            }
        }
        return false;
    }
}
