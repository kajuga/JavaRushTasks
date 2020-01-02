package com.javarush.task.task19.task1926;

/* 
Перевертыши
/home/sashok/1926.txt
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (bufferedReader.ready()){
            StringBuilder bulder = new StringBuilder(bufferedReader.readLine());
            System.out.println(bulder.reverse().toString());
        }
        bufferedReader.close();
    }
}