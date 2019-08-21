package com.midmarsh.io;

import java.nio.file.*;

public class PathExamplesApp1 {

    public static void main(String[] args) throws Exception {
        final String HOME = System.getProperty("user.home");
        Path homePath = Paths.get(HOME);
        System.out.println("pathHome: " + homePath);
        Path logPath = FileSystems.getDefault().getPath("logs", "data.log");
        System.out.println("logPath: " + logPath);
        
        System.out.println("Files.exists(homePath): " + Files.exists(homePath));
        System.out.println("Files.notExists(logPath): " + Files.notExists(logPath));
        
        System.out.println("Files.isRegularFile(homePath): " + Files.isRegularFile(homePath));
        System.out.println("Files.isReadable(logPath): " + Files.isReadable(logPath));
        System.out.println("Files.isWritable(logPath): " + Files.isWritable(logPath));
        System.out.println("Files.isExecutable(logPath): " + Files.isExecutable(logPath));
        
        Path p1 = Paths.get(HOME);
        Path p2 = Paths.get(HOME);
     
        System.out.println("Files.isSameFile(p1, p2): " + Files.isSameFile(p1, p2));
        
        
        Path logs = Paths.get("logs");
        Files.deleteIfExists(logs);
        
        Files.createDirectory(logs);
        System.out.println("Files.isDirectory(logs): " + Files.isDirectory(logs));
        
        System.out.println("logPath exists: " + Files.exists(logPath));
        Files.createFile(logPath);
        System.out.println("logPath now exists: " + Files.exists(logPath));
        
        Path currentPath = Paths.get(".");
        String prefix = "temp_";
        String suffix = ".txt";
        Path temp1 = Files.createTempFile(currentPath, prefix, suffix);
        System.out.println("temp1: " + temp1);
        Path temp2 = Files.createTempFile(currentPath, null, null);
        System.out.println("temp2: " + temp2);
        
        Files.delete(logPath); 
        Files.delete(logs); // Throws an exception if dir does not exist

        
        
        
    }

}
