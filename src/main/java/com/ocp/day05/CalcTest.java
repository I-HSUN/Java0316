package com.ocp.day05;

import com.ocp.day05.util.Calc;
import static  com.ocp.day05.util.Calc.*;
import java.util.stream.Stream;

public class CalcTest {
    public static void main(String[] args) {
        System.out.println(Calc.add(10, 20));
        System.out.println(Calc.sub(10, 20));
        System.out.println(Calc.mul(10, 20));
        System.out.println(Calc.div(10, 20));
        System.out.println("==========================");
        System.out.println(add(10, 20));
        System.out.println(sub(10, 20));
        System.out.println(mul(10, 20));
        System.out.println(div(10, 20));
        
   
    }
}
