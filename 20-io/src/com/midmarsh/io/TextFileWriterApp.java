package com.midmarsh.io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TextFileWriterApp {

    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.dat")));
        dos.write(42);
        dos.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));

        PrintWriter pw = new PrintWriter(bw);
        pw.println("John");
        pw.close();

    }

}
