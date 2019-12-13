package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        int[] arr = new int[256];
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count = 0;
        while (inputStream.available() > 0) {
            if (inputStream.read() == 44) {
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}