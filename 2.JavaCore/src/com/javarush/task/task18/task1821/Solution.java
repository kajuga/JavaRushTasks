package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] ints = new int[256];

        try {
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            while (fileInputStream.available() > 0) {
                ints[fileInputStream.read()]++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
