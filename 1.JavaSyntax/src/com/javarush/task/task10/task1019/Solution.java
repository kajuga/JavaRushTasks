package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, id);


            } catch (Exception e) {
                break;
            }
        }
        for (Map.Entry<String, Integer> mapa : map.entrySet()) {
            System.out.println(mapa.getValue() + " " + mapa.getKey());
        }
    }
}
