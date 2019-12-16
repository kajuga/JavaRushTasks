package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
//    /home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1818/sashok1.txt
//    /home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1818/sashok2.txt
//    /home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1818/sashok3.txt

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String filename1 = bufferedReader.readLine();
            String filename2 = bufferedReader.readLine();
            String filename3 = bufferedReader.readLine();
            bufferedReader.close();
            FileInputStream fileInputStream = new FileInputStream(filename2);
            FileOutputStream fileOutputStream = new FileOutputStream(filename1);
            while (fileInputStream.available() > 0) {
                fileOutputStream.write(fileInputStream.readAllBytes());
            }
            fileInputStream = new FileInputStream(filename3);
            while (fileInputStream.available() > 0) {
                fileOutputStream.write(fileInputStream.readAllBytes());
            }
            fileOutputStream.flush();
            fileInputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
