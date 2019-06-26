package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new LinkedList<>();
        try {
            while (true) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (Exception e) {
            for (Integer z : list
            ) {
                System.out.println(z);
            }
        }
    }
}