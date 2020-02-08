package com.javarush.task.task31.task3106;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String nameFile = args[0];
        for (int i = 1; i < args.length; i++) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(nameFile)) {
                try (ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(args[i].getBytes()))) {
                    while (zipInputStream.available() > 0) {
                        fileOutputStream.write(zipInputStream.read(args[i].getBytes()));
                    }
                }
            }
        }
    }
}