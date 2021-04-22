package com.ocp.day16;

public class AreaCalc {
    public static void main(String[] args) {
        double r = 15.0;
        CircleArea ca2 = new CircleArea() {
            @Override
            public double getArea(double r){
                return Math.pow(r, 2)* Math.PI;
            }
             //To change body of generated lambdas, choose Tools | Templates.
        };
        System.out.println(ca2.getArea(r));
        double a = 4.0/3;
        CircleArea ca3 = new CircleArea() {
            @Override
            public double getArea(double r){
                return a * Math.pow(r, 3)* Math.PI;
            }
        };
        System.out.println(ca3.getArea(r));
    }
}
