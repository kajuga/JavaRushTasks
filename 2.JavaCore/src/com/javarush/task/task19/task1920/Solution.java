package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, Double> counter = new HashMap<>();


        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] temp = line.split(" ");
                if (!counter.containsKey(temp[0])) {
                    counter.put(temp[0], Double.parseDouble(temp[1]));
                } else {
                    counter.replace(temp[0], counter.get(temp[0]), counter.get(temp[0]) + Double.parseDouble(temp[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Double max = 0.0;
        for (Double tempMap : counter.values()) {
            if (tempMap > max) {
                max = tempMap;
            }
        }
        for (Map.Entry<String, Double> pair : counter.entrySet()) {
            if (pair.getValue().equals(max)) {
                System.out.println(pair.getKey());
            }
        }

    }
}