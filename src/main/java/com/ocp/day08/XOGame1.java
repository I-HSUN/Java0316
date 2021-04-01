package com.ocp.day08;

import java.util.Random;
import java.util.Scanner;

public class XOGame1 {
    public static void main(String[] args) {
        char[][] xo = new char[3][3];
        do {            
            Scanner sc = new Scanner(System.in);
            print(xo);
            //user
            System.out.println("請選擇(0~8)==>");
            int n= sc.nextInt();
            xo[n/3][n%3]='O';
            
            while (true) {                
                //pc
                int m = new Random().nextInt(8);
                if (xo[m/3][m%3] =='\u0000') {
                    xo[m/3][m%3]='X';
                    break;
                }
                if (xo[m/3][m%3] =='\u0000'){ 
                    System.out.println("PC遊戲贏了");
                    break;
                }
            }
            if (xo[n/3][n%3] !='\u0000') {
                System.out.println("USER遊戲贏了");
                break;
            }
        } while (true);

    }
    public static  void print(char[][] xo){
        for (char[] cs : xo) {
            System.out.print("| ");
            for (char c : cs) {
                System.out.print( c + " | ");
            }
            System.out.println();
        }
    }
}
