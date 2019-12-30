package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

////home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1909/text1.txt
////home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1909/text1.txt

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader filenameReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = filenameReader.readLine();
        String file2 = filenameReader.readLine();
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);
        BufferedReader br = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        String line;
        while (br.ready()) {
            line = br.readLine().replace(".", "!");
            bw.newLine();
            bw.write(line);
        }
        filenameReader.close();
//        fileReader.close();
//        fileWriter.close();
        br.close();
        bw.close();
    }
}
