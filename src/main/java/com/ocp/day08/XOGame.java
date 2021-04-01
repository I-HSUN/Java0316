package com.ocp.day08;

public class XOGame {
    public static void main(String[] args) {
        char[][] xo = {{'O','X','O'},{' ','X','X'},{'O',' ',' '}};
        print(xo);
        System.out.println("輸入xo[1][0]'O'");
        xo[1][0]='O';
        print(xo);
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
