package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Paths;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(Paths.get(args[0]).toFile(), "rw")) {
            byte [] arr = new byte[args[2].length()];
            raf.seek(Long.parseLong(args[1]));
            raf.read(arr, 0, arr.length);
            raf.seek(arr.length);
            raf.write(String.valueOf(new String(arr).equals(arr[2])).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
