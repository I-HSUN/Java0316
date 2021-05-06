package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

    public static void main(String[] args) {
        //國英數分數介於0-100之間
        Set scores = new LinkedHashSet();
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        scores.add(3.14);
        scores.add(true);
        Iterator iter = scores.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
//            if (next instanceof Boolean) {
//                iter.remove();
//                continue;
//            }
//            if (next instanceof Integer) {
//                if ((Integer)next ==2000) {
//                    iter.remove();
//                    continue;
//                }
//            }
//            if (next instanceof Double) {
//                if ((Double)next ==3.14) {
//                    iter.remove();
//                    continue;
//                }
//            }
            if (next instanceof Integer) {
                int score = (Integer) next;
                if (!(score >= 0 && score <= 100)) {
                    iter.remove();

                }
            } else {
                iter.remove();

            }

        }
        System.out.println(scores);//此時原本的scores Set內容已經更新
        //求總分
        iter = scores.iterator();//重新取得走訪器
        int sum = 0;
        while (iter.hasNext()) {
            Object next = iter.next();
            int score = (Integer) next;
            sum += score;
        }
        System.out.println(sum);
    }
}
