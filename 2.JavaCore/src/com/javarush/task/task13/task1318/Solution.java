package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        String filename = "/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task13/task1318/sashok.txt";
        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(fileNameReader.readLine()))) {
            StringBuilder sb = new StringBuilder();
            String line = fileReader.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = fileReader.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}