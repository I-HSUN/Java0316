package com.Java8.L8_Exception.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
    public static String readFile(String name) {
        StringBuilder text = new StringBuilder();
        try {
            Scanner console = new Scanner(new FileInputStream(name));
            while (console.hasNext()) {                
                text.append(console.nextLine()).append('\n');
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return text.toString();
    }
    
}
