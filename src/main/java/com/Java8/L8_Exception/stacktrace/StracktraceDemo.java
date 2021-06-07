package com.Java8.L8_Exception.stacktrace;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class StracktraceDemo {
    public static void main(String[] args) {
        try {
            c();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        /*
        程式碼中不可有私吞例外行為，會對應用程式維護造成嚴重傷害
        try {
            ...
        } catch (SomeException ex) {
            //什麼也沒有，絕對不要這麼做
        }
        另一種會對應用程式維護造成嚴重傷害方式
        try {
            ...
        } catch (FileNotFoundException ex) {
            做一些處裡
        } catch (EOFException ex) {
            做一些處裡
        }
        try {
            ...
        } catch (IOException ex) {
            System.out.println("找不到檔案");
        }      
        */

    }
    static void c(){
        b();
    }
    static void b(){
        a();
    }
    static String a(){
        String text = null;
        return text.toUpperCase();
    }
}
