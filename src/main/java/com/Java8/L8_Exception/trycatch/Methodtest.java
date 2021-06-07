package com.Java8.L8_Exception.trycatch;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Methodtest {
    public static void doSome(String arg)throws FileNotFoundException,EOFException{
        try {
            if ("one".equals(arg)) {
                throw new FileNotFoundException();
            }else{
                throw new EOFException();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw ex;
        } catch (EOFException ex){
            ex.printStackTrace();
            throw ex;//此拋出在JDK 6會出錯
        }
    }
    
}
