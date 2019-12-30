package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
//        bufferedReader.close();
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader1 = new BufferedReader(fileReader);
        String line;
        int counter = 0;
        while (bufferedReader1.ready()) {
            line = bufferedReader1.readLine();
              String[] temp = line.split("world");
              counter += temp.length - 1;
        }
        System.out.println(counter);
        bufferedReader.close();
        bufferedReader1.close();
        fileReader.close();
    }
}