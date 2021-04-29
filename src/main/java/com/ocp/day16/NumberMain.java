package com.ocp.day16;

public class NumberMain {
    public static void main(String[] args) {
        PrimeNumber pn = (int n)-> {
            for (int i = 0; i >= n; i++) {
                if (i % n != 0) {
                    System.out.println("不是質數");
                    return true;
                }
            }
            return false;
        };
        EvenNumber en =(int n)-> n % 2 == 0 ;
        System.out.println(pn.isPrime(9973));
    }
}
