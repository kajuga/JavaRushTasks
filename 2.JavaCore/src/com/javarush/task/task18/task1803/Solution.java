package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine())) {
            List<Byte> arr = new ArrayList<>();

            while (fileInputStream.available() > 0) {
                arr.add((byte) fileInputStream.read());
            }

            int count;
            int max = 0;

            Map<Byte, Integer> map = new HashMap<>();
            for (Byte b : arr) {
                count = Collections.frequency(arr, arr.get(b));
                map.put(b, count);
            }
            if (!map.isEmpty()) {
                max = Collections.max(map.values());
            }
            for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
                if (pair.getValue() == max) {
                    System.out.println(pair.getKey() + " ");
                }
            }
        }
    }
}