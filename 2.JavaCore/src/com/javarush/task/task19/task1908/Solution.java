package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/
///home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1908/text1.txt
///home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1908/text2.txt

import java.io.*;

public class Solution {

    private static boolean isNumeric(String ops) {
        return ops.matches("[-+]?\\d*\\.?\\d+");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename2));


        while (bufferedReader.ready()){
            String ops2 = bufferedReader.readLine();
            String[] ops3 = ops2.split(" ");
            for(String ops : ops3){
                if (isNumeric(ops)) {
                    bufferedWriter.write(ops);
                    bufferedWriter.write(" ");

                }
            }
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}