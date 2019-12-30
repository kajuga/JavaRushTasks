package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/
///home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1910/text1.txt

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bReader.readLine();
        String file2 = bReader.readLine();
        bReader.close();
        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        while (br.ready()) {
            String line = br.readLine();
            String temp = line.replaceAll("[!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~]", "");
            bw.write(temp);
        }
        br.close();
        bw.close();
    }
}