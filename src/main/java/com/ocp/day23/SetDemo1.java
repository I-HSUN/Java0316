package com.ocp.day23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set subjects1 = new HashSet();
        subjects1.add("國");
        subjects1.add("英");
        subjects1.add("數");
        System.out.println("subjects1 : " + subjects1);
        Set subjects2 = new LinkedHashSet();
        subjects2.add("國");//String
        subjects2.add("英");//String
        subjects2.add(null);//null
        subjects2.add("數");//String
        subjects2.add(100);//Integer
        subjects2.add(90);
        System.out.println("subjects2 : " + subjects2);
        //走訪每一個元素
        Iterator iter = subjects2.iterator();
//        System.out.println(iter.next() + ", " + iter.hasNext());
//        System.out.println(iter.next() + ", " + iter.hasNext());
//        System.out.println(iter.next() + ", " + iter.hasNext());
//        System.out.println(iter.next() + ", " + iter.hasNext());
//        System.out.println(iter.next() + ", " + iter.hasNext());
//        System.out.println("-----------------------------------");
        while (iter.hasNext()) {
            Object next = iter.next();
//            System.out.println(next);
            if(next == null){
                iter.remove();
                continue;
            }
            if (next instanceof Integer) {
                if ((Integer)next==100) {
                    iter.remove();
                }
                
            }
            System.out.println(next);
        }
    }
    
}
