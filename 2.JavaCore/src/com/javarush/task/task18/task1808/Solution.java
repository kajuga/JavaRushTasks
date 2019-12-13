package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1;
        String file2;
        String file3;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputBase = new FileInputStream(reader.readLine())) {
            file2 = reader.readLine();
            file3 = reader.readLine();
            FileOutputStream fileOutputStreamFile2 = new FileOutputStream(file2);
            FileOutputStream fileOutputStreamFile3 = new FileOutputStream(file3);

            while (fileInputBase.available() > 0) {
                byte[] buffer = new byte[fileInputBase.available()];
                for (int i = 0; i < buffer.length; i++) {
                    if (i % 2 == 0) {
                        fileOutputStreamFile2.write(buffer[i]);
                    } else {
                        fileOutputStreamFile3.write(buffer[i]);
                    }
                }
            }
            fileOutputStreamFile2.close();
            fileOutputStreamFile3.close();

        }
    }
}
