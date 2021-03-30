package com.ocp.day07;

public class StringReplaceDemo {
    public static void main(String[] args) {
        String s1 = "Jbvb";
        System.out.println("s1:" + s1.hashCode());
        String s2 = "Java";
        System.out.println("s2:" + s2.hashCode());
        s1 = s1.replace("b", "a");
        System.out.println("s1:" + s1.hashCode());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
    
}
