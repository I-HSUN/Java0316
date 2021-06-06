package com.Java8.L8_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true) {            
            try {
                int number = console.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
            } catch (InputMismatchException ex) {
                System.out.println("必須輸入整數");
            }    
        }
        System.out.printf("平均 %.2f%n", sum / count);            
        

    }
}
