package com.example.xmleditor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void write(String s)
    {
        try {
            File myObj = new File("/home/linux/Desktop/filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter("/home/linux/Desktop/filename.txt", false);
            writer.write(s);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


