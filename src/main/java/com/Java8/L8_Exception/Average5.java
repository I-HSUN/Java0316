package com.Java8.L8_Exception;

import java.io.IOException;


public class Average5 {
    public static void main(String[] args) {
        
        /*
        錯誤父類別不能先被捕捉
        try {
            
        } catch (Exception e) {
        } catch (IOException e) {
        }

        正確
        try {
            System.in.read();
        } catch (IOException e) {
        } catch (Exception e) {
        }
        
        範例如果需要以下捕捉:
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        在JDK7 可用多重捕捉(可編譯)
        try {
            System.in.read();
        } catch (IOException | InterruptedException | InterruptedException e){
            e.printStackTrace();
        }
        在JDK7 可用多重捕捉(不可編譯因為不能有繼承關係)
        try {
            System.in.read();
        } catch (IOException | Exception e){
            e.printStackTrace();
        }
        */

    }
}
