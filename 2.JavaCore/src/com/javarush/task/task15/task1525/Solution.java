package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {

        public static List<String> lines = new ArrayList<String>();

        static {
            try (BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
                String str;
                while ((str = reader.readLine()) != null) {
                    lines.add(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public static void main(String[] args) {
            System.out.println(lines);
        }


    }




/*
 Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8).forEach(System.out::println);
 */