package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String filename = bufferedReader.readLine();
            while (!filename.equals("exit")) {
                list.add(filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        int[] bytes = new int[255];
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                byte b;
                while (fileInputStream.available() > 0) {
                    b = (byte) fileInputStream.read();
                    bytes[b]++;
                }
        } catch (IOException e) {
                e.printStackTrace();
            }
            int max = 0;
            int indexMax = 0;

            for (int i = 0; i < bytes.length; i++) {
                if(max < bytes[i]) {
                    max = bytes[i];
                    indexMax = i;
                }
            }
            synchronized (resultMap) {
                resultMap.put(this.fileName, indexMax);
            }
        }
    }
}
