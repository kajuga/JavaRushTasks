package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);
        Charset windows1251 = Charset.forName("Windows-1251");
        Charset utf8 = Charset.forName("UTF-8");

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);

        String string = new String(buffer, windows1251);
        buffer = string.getBytes(utf8);
        fileOutputStream.write(buffer);

        fileInputStream.close();
        fileOutputStream.close();
    }
}