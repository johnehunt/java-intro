package com.midmarsh.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInputReader {

    public static void main(String[] args) throws Exception {
        String s;
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        // Check for end of input stream
        while (!s.equals("")) { 
            System.out.println("Read: '" + s + "'");
            s = reader.readLine();
        }
    }

}
