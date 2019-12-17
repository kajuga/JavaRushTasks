package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<FileReader> fileReaders = new ArrayList<>();
        String temp = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                temp = bufferedReader.readLine();
                fileReaders.add(new FileReader(temp));
            }
        } catch (FileNotFoundException e) {
            System.out.println(temp);
        } catch (IOException e) {
        }
        for (FileReader fr: fileReaders) {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
