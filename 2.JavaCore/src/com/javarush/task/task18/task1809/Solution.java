package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.lang.reflect.Array;

public class Solution {
//    /home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1809/sashok1.txt
//    /home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1809/sashok2.txt

    public static void main(String[] args) throws IOException {
        String filename1;
        String filename2;

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        filename1 = "/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1809/sashok1.txt";
        filename2 = "/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1809/sashok2.txt";
        FileInputStream fileInputStream = new FileInputStream(filename1);
        FileOutputStream fileOutputStream = new FileOutputStream(filename2);
        byte[]bytes = new byte[fileInputStream.available()];
        int k = 0;
        while (fileInputStream.available() > 0) {
            bytes[k] = (byte) fileInputStream.read();
            System.out.print (bytes[k] + " ");
            k++;
        }

        fileInputStream.close();
       System.out.println("==================================================");
        for (int i = bytes.length - 1; i >=0 ; i--) {
           System.out.print(bytes[i] + " ");
           fileOutputStream.write(bytes[i]);
       }


        fileOutputStream.flush();
        fileOutputStream.close();



    }
}
