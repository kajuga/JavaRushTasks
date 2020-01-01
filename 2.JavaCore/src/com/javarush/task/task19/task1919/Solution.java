package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
//        if (args.length == 0) return;
//        String filename = args[0];
        String filename = "/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1919/sashok.txt";
        Map<String, Double> stringFloatMap = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int whiteSpaseIndex = line.indexOf(" ");
                String key = line.trim().substring(0, whiteSpaseIndex);
                Double value = Double.parseDouble((line.substring(whiteSpaseIndex + 1)));
                if (!stringFloatMap.containsKey(key)) {
                    stringFloatMap.put(key, value);
                } else {
                    stringFloatMap.put(key, stringFloatMap.get(key) + value);
                    System.out.println(stringFloatMap.entrySet());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, Double> entry : stringFloatMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}