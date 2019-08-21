package com.jjh.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionExample {

    public static void main(String[] args) {
        ExceptionExample ee = new ExceptionExample();
        ee.save("temp.txt");
    }

    public void save(String filename) {
        System.out.println("Entering save() method");
        try {
            System.out.println("Starting to save data to file");
            saveDataToFile(filename);
            System.out.println("Completed saving data");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("Exiosting save() method");
    }

    private void saveDataToFile(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
//        throw new RuntimeException("John was here");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.print("hello world");
        pw.close();
    }

    public String readFirstLineFromFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            return br.readLine();
        }
    }

}
