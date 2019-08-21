package com.midmarsh.io;

import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(Paths.get("test.txt"));
        scanner.useDelimiter(",");
        while (scanner.hasNext()) { 
            String text = scanner.next(); 
            System.out.println("text: " + text);
        }
        scanner.close();
    }
    
}
