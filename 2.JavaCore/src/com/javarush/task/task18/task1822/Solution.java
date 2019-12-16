package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {

//    /home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1822/sashok22.txt

    public static void main(String[] args) {
        String result;

        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(fileNameReader.readLine());
             BufferedReader dataFileReader = new BufferedReader(fileReader)) {
            String res;
            while ((res = dataFileReader.readLine()) != null) {
                if (res.startsWith(args[0])) {
                    System.out.println(res);
                }
            }
        } catch (IOException e) {
        }
    }
}
