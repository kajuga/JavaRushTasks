package com.javarush.task.task19.task1923;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader fileReader1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));
        while (fileReader1.ready()) {
            String str = fileReader1.readLine();
            String[] stringArray = str.split(" ");
            for (String z : stringArray) {
                if (z.matches(".*\\d.*"))
                    fileWriter.write(z + " ");
            }
        }
        fileReader1.close();
        fileWriter.close();
    }
}