package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;
        try {
            String sourceFileName = reader.readLine();
            String destinationFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
            fileOutputStream = getOutputStream(destinationFileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");

        }
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

