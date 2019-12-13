package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine())) {

            Map<Integer, Integer> map = new HashMap<>();
            while (fileInputStream.available() > 0) {
                int x = fileInputStream.read();
                int freq = map.get(x);
                map.put(x, freq == 0 ? 1 : freq + 1);
            }
            int minFrequency = Collections.min(map.values());

            for (Map.Entry cur : map.entrySet()) {
                if (cur.getValue().equals(minFrequency)) {
                    System.out.println(cur.getKey() + " ");
                }
            }
        }
    }
}
