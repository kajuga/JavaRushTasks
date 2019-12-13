package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int maxByte = 0;

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine())) {
            while (fileInputStream.available() > 0) {
                int temp = fileInputStream.read();
                if (temp > maxByte) {
                    maxByte = temp;
                }
            }
        }
        System.out.println(maxByte);
    }
}
