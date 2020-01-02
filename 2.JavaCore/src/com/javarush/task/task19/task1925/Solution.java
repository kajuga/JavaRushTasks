package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];
        try (Scanner scanner = new Scanner(new FileReader(file1));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2))) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.next();
                if (line.length() > 6) {
                    fileWriter.write(line + " ");
                }
            }


        } catch (IOException e) {

        }


    }
}
