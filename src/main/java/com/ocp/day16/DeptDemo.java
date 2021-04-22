package com.ocp.day16;

public class DeptDemo {
    public static void main(String[] args) {
        //第一種寫法
        Dept dept = new Dept();
        Dept.Stuff stuff = dept.new Stuff();
        stuff.job();
        //第二種寫法
        Dept.Stuff stuff2 = new Dept().new Stuff();
        stuff2.job();
        //第三種寫法
        new Dept().new Stuff().job();
    }
    
}
