package com.Java8.L8_Exception.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil2 {
    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
            Scanner console = new Scanner(new FileInputStream(name));
            while (console.hasNext()) {                
                text.append(console.nextLine()).append('\n');
            }
        
        return text.toString();
    }
    
}
