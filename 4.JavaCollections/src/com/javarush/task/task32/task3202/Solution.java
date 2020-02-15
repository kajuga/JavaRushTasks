package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("/home/kajuga/projects/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task32/task3202/testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        if (is == null) {
            return new StringWriter();
        }
        StringWriter stringWriter = new StringWriter();
        String line;
        BufferedReader readeer = new BufferedReader(new InputStreamReader(is));
        while ((line = readeer.readLine()) != null) {
            stringWriter.write(line + "\n");
        }
        return stringWriter;
    }
}