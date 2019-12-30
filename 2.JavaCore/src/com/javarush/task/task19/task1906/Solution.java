package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
//    /home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1906/filename1.txt
//    /home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1906/filename2.txt

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileReader fileReader = new FileReader(reader.readLine());
            FileWriter fileWriter = new FileWriter(reader.readLine());
            int i = 1;
            while (fileReader.ready()) {
                int value = fileReader.read();
                if (i % 2 == 0) {
                    fileWriter.write(value);
                }
                i++;
            }
            reader.close();
            fileReader.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}