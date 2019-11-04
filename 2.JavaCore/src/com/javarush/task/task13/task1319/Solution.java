package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine(), false))) {
            String line;
            do {
                line = reader.readLine();
                bufferedWriter.write(line + "\n");
            } while (!line.equals("exit"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
