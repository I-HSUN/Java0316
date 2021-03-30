
package com.ocp.day07;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("吃浦萄吐葡萄");
        //吃葡萄不吐葡萄皮
        sb.append("皮");
        System.out.println(sb);
        sb.insert(3, "不");
        sb.replace(1, 2, "葡");
        System.out.println(sb);
        //吐葡萄
        sb.delete(0, 4);
        System.out.println(sb);
        //皮去掉
        sb.delete(3, sb.length());
        System.out.println(sb);
    }
    
}
