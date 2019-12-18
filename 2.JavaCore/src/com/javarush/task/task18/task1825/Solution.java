package com.javarush.task.task18.task1825;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.*;

/* 
Собираем файл
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi.part1
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi.part2
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi.part3
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi.part4
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> partNameList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = reader.readLine()).contains("end")) {
            partNameList.add(line);
        }
        reader.close();
        Collections.sort(partNameList);
        String filename = partNameList.get(0).substring(0, partNameList.get(0).lastIndexOf('.'));
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        byte[] buffer = new byte[1024];
        for (String part : partNameList) {
            FileInputStream fileInputStream = new FileInputStream(part);
            while (fileInputStream.available() > 0) {
                int count = fileInputStream.read(buffer);
                fileOutputStream.write(buffer, 0, count);
            }
            fileInputStream.close();
        }
        reader.close();
        fileOutputStream.close();
    }
}