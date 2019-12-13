package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[256];
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        while (inputStream.available() > 0) {
            array[inputStream.read()]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                System.out.print(i + " ");
            }
        }
        inputStream.close();

    }
}


