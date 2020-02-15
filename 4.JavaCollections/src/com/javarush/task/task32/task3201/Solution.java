package com.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Paths;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) {
        int cursor = Integer.parseInt(args[1]);
        String insertThat = args[2];

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(Paths.get(args[0]).toFile(), "rw")) {
            if(cursor < randomAccessFile.length()) {
                randomAccessFile.seek(cursor);
                randomAccessFile.write(insertThat.getBytes());
            } else {
                long tempPosition = randomAccessFile.length();
                randomAccessFile.seek(tempPosition);
                randomAccessFile.write(insertThat.getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
