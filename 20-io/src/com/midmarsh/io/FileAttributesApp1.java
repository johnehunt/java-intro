package com.midmarsh.io;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;

public class FileAttributesApp1 {

    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Set<String> views = fs.supportedFileAttributeViews();
        for (String v : views) {
            System.out.println(v);
        }

        System.out.println("-------");

        Path path = Paths.get(System.getProperty("user.home"));
        System.out.println(path);
        try {
            BasicFileAttributes fileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("isDirectory: " + fileAttributes.isDirectory());
            System.out.println("size: " + fileAttributes.size());
            System.out.println("created: " + fileAttributes.creationTime());
            System.out.println("last modified: " + fileAttributes.lastModifiedTime());
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }
}